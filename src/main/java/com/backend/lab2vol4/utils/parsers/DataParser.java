package com.backend.lab2vol4.utils.parsers;

import java.io.IOException;
import java.util.Optional;

public interface DataParser<T> {
    Optional<T> parseFromJSON(String json) throws IOException;
    String parseToJSON(T t) throws IOException;
}
