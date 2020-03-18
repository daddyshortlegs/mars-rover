package com.andy;

class Bearing {
    Compass compass = Compass.North;
    Coordinate coordinate = new Coordinate(0, 1);

    void turnRight() {
        compass = compass.turnRight();
        coordinate = compass.getCoordinate();
    }

    public void turnLeft() {
        compass = compass.turnLeft();
        coordinate = compass.getCoordinate();
    }

    @Override
    public String toString() {
        return compass.toString();
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
}
