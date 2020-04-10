package com.andy;

public class West implements Direction {
    @Override
    public void turnRight(Grid grid) {
        grid.setDirection(new North());
    }

    @Override
    public void turnleft(Grid grid) {
        grid.setDirection(new South());
    }

    @Override
    public Coordinate getCoordindate() {
        return new Coordinate(-1, 0);
    }

    @Override
    public String toString() {
        return "W";
    }
}
