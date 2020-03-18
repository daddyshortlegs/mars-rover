package com.andy;

class Position {
    private final Coordinate coordinate;
    private Compass compass = Compass.North;

    public Position(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

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

    public void move() {
        coordinate.add(getCoordinate());
    }
}
