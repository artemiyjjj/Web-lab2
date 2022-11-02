package com.backend.lab2vol4.utils.validators;

import java.util.Optional;

public interface Validator<T> {
    Optional<T> validate(T t);
}
