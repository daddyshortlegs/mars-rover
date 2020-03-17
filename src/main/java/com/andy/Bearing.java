package com.andy;

class Bearing {
    Compass compass = Compass.North;
    Coordinate coordinate = new Coordinate(0, 1);

    void turnRight() {
        if (compass == Compass.North) {
            compass = Compass.East;
            coordinate = new Coordinate(1, 0);
        } else if (compass == Compass.East) {
            compass = Compass.South;
            coordinate = new Coordinate(0, -1);
        } else if (compass == Compass.South) {
            compass = Compass.West;
            coordinate = new Coordinate(-1, 0);
        } else if (compass == Compass.West) {
            compass = Compass.North;
            coordinate = new Coordinate(0, 1);
        }
    }

    public void turnLeft() {
        if (compass == Compass.North) {
            compass = Compass.West;
            coordinate = new Coordinate(-1, 0);
        } else if (compass == Compass.West) {
            compass = Compass.South;
            coordinate = new Coordinate(0, -1);
        } else if (compass == Compass.South) {
            compass = Compass.East;
            coordinate = new Coordinate(1, 0);
        } else if (compass == Compass.East) {
            compass = Compass.North;
            coordinate = new Coordinate(0, 1);
        }
    }

    @Override
    public String toString() {
        return compass.toString();
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
}
