package com.backend.lab2vol4.entities.response.utils.builders;

import com.backend.lab2vol4.entities.response.ResponseBodyForm1;

import java.util.Date;

public class ResponseBodyForm1Builder implements ResponseBodyBuilder<ResponseBodyForm1> {
    private final ResponseBodyForm1 responseBody = new ResponseBodyForm1();

    @Override
    public ResponseBodyForm1 build() {
        return responseBody;
    }

    public ResponseBodyForm1Builder withX(double x) {
        responseBody.setX(x);
        return this;
    }

    public ResponseBodyForm1Builder withY(double y) {
        responseBody.setY(y);
        return this;
    }

    public ResponseBodyForm1Builder withR(double r) {
        responseBody.setR(r);
        return this;
    }

    public ResponseBodyForm1Builder withResult(boolean result) {
        responseBody.setResult(result);
        return this;
    }

    public ResponseBodyForm1Builder withCurrentTime(Date currentTime) {
        responseBody.setCurrentTime(currentTime);
        return this;
    }

    public ResponseBodyForm1Builder withExecutionTime(Date executionTime) {
        responseBody.setExecutionTime(executionTime);
        return this;
    }

}
