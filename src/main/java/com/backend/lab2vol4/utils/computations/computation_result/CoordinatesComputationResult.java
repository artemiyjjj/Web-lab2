package com.backend.lab2vol4.utils.computations.computation_result;

import com.backend.lab2vol4.entities.coordinates.Coordinates;

public class CoordinatesComputationResult implements ComputationResult<Coordinates> {
    private boolean isHit;
    private Coordinates coordinates;

    public CoordinatesComputationResult(boolean isHit, Coordinates coordinates) {
        this.isHit = isHit;
        this.coordinates = coordinates;
    }

    public boolean isHit() {
        return isHit;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }


}
