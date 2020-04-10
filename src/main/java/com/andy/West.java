package com.andy;

public class West implements Direction {
    @Override
    public void turnRight(Grid grid) {
        grid.setDirection(new North());
    }

    @Override
    public void turnLeft(Grid grid) {
        grid.setDirection(new South());
    }

    @Override
    public Coordinate getCoordinate() {
        return new Coordinate(-1, 0);
    }

    @Override
    public String toString() {
        return "W";
    }
}
