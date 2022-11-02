package com.backend.lab2vol4.utils.validators;

import com.backend.lab2vol4.entities.coordinates.Coordinates;

import java.util.Optional;

public class CoordinatesValidator implements Validator<Coordinates> {

    @Override
    public Optional<Coordinates> validate(Coordinates coordinates) {
        return Optional.of(coordinates);
    }

}
//Todo логика валидации