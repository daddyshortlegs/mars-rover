package com.andy;

public class East implements Direction {
    @Override
    public void turnRight(Grid grid) {
        grid.setDirection(new South());
    }

    @Override
    public void turnleft(Grid grid) {
        grid.setDirection(new North());
    }

    @Override
    public Coordinate getCoordindate() {
        return new Coordinate(1, 0);
    }

    @Override
    public String toString() {
        return "E";
    }
}
