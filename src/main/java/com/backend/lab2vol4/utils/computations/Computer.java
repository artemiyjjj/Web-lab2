package com.backend.lab2vol4.utils.computations;

import com.backend.lab2vol4.utils.computations.computation_result.ComputationResult;

import java.util.Optional;

public interface Computer<T> {
    ComputationResult<T> compute(T t);
}
