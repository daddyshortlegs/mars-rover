package com.andy;

public class North implements Direction {
    @Override
    public void turnRight(Grid grid) {
        grid.setDirection(new East());
    }

    @Override
    public void turnleft(Grid grid) {
        grid.setDirection(new West());
    }

    @Override
    public Coordinate getCoordindate() {
        return new Coordinate(0, 1);
    }

    @Override
    public String toString() {
        return "N";
    }
}
