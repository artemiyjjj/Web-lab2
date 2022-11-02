package com.backend.lab2vol4.entities.response;

import java.util.Date;

public class ResponseBodyForm1 implements ResponseBody {
    private double x;
    private double y;
    private double r;
    private boolean result;
    private Date currentTime;
    private Date executionTime;

    public ResponseBodyForm1() {}

    public ResponseBodyForm1(double x, double y, double r, boolean result, Date currentTime, Date executionTime) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.result = result;
        this.currentTime = currentTime;
        this.executionTime = executionTime;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public void setExecutionTime(Date executionTime) {
        this.executionTime = executionTime;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public boolean isResult() {
        return result;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public Date getExecutionTime() {
        return executionTime;
    }


}
