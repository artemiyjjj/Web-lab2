package com.backend.lab2vol4.utils.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    Optional<T> get(long id);
    void save(T t);
    void update(T t, List params);

}
