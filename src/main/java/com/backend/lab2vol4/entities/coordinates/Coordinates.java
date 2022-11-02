package com.backend.lab2vol4.entities.coordinates;

public class Coordinates {
    private double x;
    private double y;

    public Coordinates() {
        this.x = 0;
        this.y = 0;
        this.r = 0;
    }

    public Coordinates(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
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

    private double r;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public String toString() {
        return "x: " + x + "\n" +
                "y: " + y + "\n" +
                "r: " + r + "\n";
    }
}
