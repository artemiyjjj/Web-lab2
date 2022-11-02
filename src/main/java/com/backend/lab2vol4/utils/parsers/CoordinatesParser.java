package com.backend.lab2vol4.utils.parsers;


import com.backend.lab2vol4.entities.coordinates.Coordinates;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletInputStream;
import java.io.IOException;
import java.util.Optional;

public class CoordinatesParser implements DataParser<Coordinates> {

    @Override
    public Optional<Coordinates> parseFromJSON(String json) {
        try {
            return Optional.of(new ObjectMapper().readValue(json, Coordinates.class));
        } catch (JsonProcessingException e) {
            return Optional.empty();
        }
    }

    @Override
    public String parseToJSON(Coordinates coordinates) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(coordinates);
    }

    public Optional<Coordinates> parseFromServletInputStream(ServletInputStream input) {
        try {
            return Optional.of(new ObjectMapper().readValue(input, Coordinates.class));
        } catch (IOException e) {
            return Optional.empty();
        }
    }
}
