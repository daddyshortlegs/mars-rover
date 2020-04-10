package com.andy.compass;

import com.andy.Coordinate;
import com.andy.Grid;
import com.andy.compass.Direction;
import com.andy.compass.North;
import com.andy.compass.South;

public class East implements Direction {
    @Override
    public void turnRight(Grid grid) {
        grid.setDirection(new South());
    }

    @Override
    public void turnLeft(Grid grid) {
        grid.setDirection(new North());
    }

    @Override
    public Coordinate getCoordinate() {
        return new Coordinate(1, 0);
    }

    @Override
    public String toString() {
        return "E";
    }
}
