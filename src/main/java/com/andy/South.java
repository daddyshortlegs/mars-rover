package com.andy;

public class South implements Direction {
    @Override
    public void turnRight(Grid grid) {
        grid.setDirection(new West());
    }

    @Override
    public void turnLeft(Grid grid) {
        grid.setDirection(new East());
    }

    @Override
    public Coordinate getCoordinate() {
        return new Coordinate(0, -1);
    }

    @Override
    public String toString() {
        return "S";
    }
}
