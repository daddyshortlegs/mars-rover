package com.andy;

class Position {
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

    public void move(Coordinate coordinate) {
        coordinate.add(getCoordinate());
    }
}
