package com.andy;

class Position {
    private final Coordinate coordinate = new Coordinate(0, 0);;
    private Compass compass = Compass.North;

    void turnRight() {
        compass = compass.turnRight();
    }

    public void turnLeft() {
        compass = compass.turnLeft();
    }

    @Override
    public String toString() {
        return coordinate.getX() + ":" + coordinate.getY() + ":" + compass.toString();
    }

    public Coordinate getCoordinate() {
        return compass.getCoordinate();
    }

    public void move() {
        coordinate.add(getCoordinate());
    }
}
