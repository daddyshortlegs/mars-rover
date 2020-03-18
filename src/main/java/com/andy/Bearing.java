package com.andy;

class Bearing {
    Compass compass = Compass.North;

    void turnRight() {
        compass = compass.turnRight();
    }

    public void turnLeft() {
        compass = compass.turnLeft();
    }

    @Override
    public String toString() {
        return compass.toString();
    }

    public Coordinate getCoordinate() {
        return compass.getCoordinate();
    }
}
