package com.backend.lab2vol4.utils.parsers;

import com.backend.lab2vol4.entities.response.ResponseBodyForm1;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Optional;

public class ResponseBodyForm1Parser implements DataParser<ResponseBodyForm1> {

    @Override
    public String parseToJSON(ResponseBodyForm1 responseBody) throws IOException {
        return new ObjectMapper().writeValueAsString(responseBody);
    }

    @Override
    public Optional<ResponseBodyForm1> parseFromJSON(String json) throws IOException {
        return Optional.of(new ObjectMapper().readValue(json, ResponseBodyForm1.class));
    }
}
