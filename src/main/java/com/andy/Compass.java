package com.andy;

enum Compass {
    North("N", new Coordinate(0, 1)),
    East("E", new Coordinate(1, 0)),
    South("S", new Coordinate(0, -1)),
    West("W", new Coordinate(-1, 0));

    private final String direction;
    private final Coordinate coordinate;

    Compass(String direction, Coordinate coordinate) {
        this.direction = direction;
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
        return direction;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
}
