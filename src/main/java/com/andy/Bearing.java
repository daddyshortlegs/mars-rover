package com.andy;

class Bearing {
    Compass compass = Compass.North;
    Coordinate coordinate = new Coordinate(0, 1);

    void turnRight() {
        if (compass == Compass.North) {
            compass = Compass.East;
        } else if (compass == Compass.East) {
            compass = Compass.South;
        } else if (compass == Compass.South) {
            compass = Compass.West;
        } else if (compass == Compass.West) {
            compass = Compass.North;
        }
        coordinate = compass.getCoordinate();
    }

    public void turnLeft() {
        if (compass == Compass.North) {
            compass = Compass.West;
        } else if (compass == Compass.West) {
            compass = Compass.South;
        } else if (compass == Compass.South) {
            compass = Compass.East;
        } else if (compass == Compass.East) {
            compass = Compass.North;
        }
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
