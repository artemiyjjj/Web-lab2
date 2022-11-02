package com.backend.lab2vol4.entities.response.utils.builders;

import com.backend.lab2vol4.entities.response.ResponseBody;

public interface ResponseBodyBuilder<T extends ResponseBody> {
    T build();
}

