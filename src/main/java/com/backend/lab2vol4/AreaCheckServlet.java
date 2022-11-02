package com.backend.lab2vol4;

import com.backend.lab2vol4.entities.coordinates.Coordinates;
import com.backend.lab2vol4.entities.response.utils.builders.ResponseBodyForm1Builder;
import com.backend.lab2vol4.exeptions.FormDataValidationException;
import com.backend.lab2vol4.utils.computations.CoordinatesComputer;
import com.backend.lab2vol4.utils.computations.computation_result.CoordinatesComputationResult;
import com.backend.lab2vol4.utils.parsers.CoordinatesParser;
import com.backend.lab2vol4.utils.parsers.ResponseBodyForm1Parser;
import com.backend.lab2vol4.utils.validators.CoordinatesValidator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Optional;

@WebServlet(name = "AreaCheckServlet", value = "/area-check-servlet")
public class AreaCheckServlet extends HttpServlet {
    private String baseServlet;

    public void init() {
        baseServlet = "/controller-servlet";
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date executionStart = new Date();
        ResponseBodyForm1Builder responseBodyBuilder = new ResponseBodyForm1Builder();
        ResponseBodyForm1Parser responseBodyParser = new ResponseBodyForm1Parser();
        response.setContentType("text/html");
        response.setStatus(200);
        PrintWriter out = response.getWriter();

        CoordinatesParser parser = new CoordinatesParser();
        Optional<Coordinates> parsedOptional = parser.parseFromServletInputStream(request.getInputStream());
        if (parsedOptional.isPresent()) {
            Coordinates coordinates = parsedOptional.get();
            PostManager manager = new PostManager();
            try {
                CoordinatesComputationResult result = manager.handle(coordinates);
                String responseBodyJSON = responseBodyParser.parseToJSON(responseBodyBuilder
                        .withX(coordinates.getX())
                        .withY(coordinates.getY())
                        .withR(coordinates.getR())
                        .withResult(result.isHit())
                        .withCurrentTime(new Date())
                        .withExecutionTime(new Date(new Date().getTime() - executionStart.getTime()))
                        .build());
                out.print(responseBodyJSON);
                out.close();
            } catch (FormDataValidationException e) {
                out.println(e.getMessage());
                response.setStatus(400);
            }
        }
        else {
            out.println("");
            response.setStatus(400);
        }
    }

    class PostManager {
        CoordinatesComputationResult handle(Coordinates coordinates) throws FormDataValidationException {
            CoordinatesValidator validator = new CoordinatesValidator();
            Optional<Coordinates> validatedOptional = validator.validate(coordinates);
            if (validatedOptional.isPresent()) {
                coordinates = validatedOptional.get();
            }
            else {
                throw new FormDataValidationException("Data is not valid.");
            }

            CoordinatesComputer computer = new CoordinatesComputer();
            return computer.compute(coordinates);
        }
    }
}
