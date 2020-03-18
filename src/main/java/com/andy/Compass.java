package com.andy;

enum Compass {
    North("N", new Coordinate(0, 1)),
    East("E", new Coordinate(1, 0)),
    South("S", new Coordinate(0, -1)),
    West("W", new Coordinate(-1, 0));

    Compass right;
    Compass left;

    static {
        North.right = East;
        East.right = South;
        South.right = West;
        West.right = North;

        North.left = West;
        East.left = North;
        South.left = East;
        West.left = South;
    }

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

    public Compass turnRight() {
        return right;
    }

    public Compass turnLeft() {
        return left;
    }
}
