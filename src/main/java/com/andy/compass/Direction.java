package com.andy.compass;

import com.andy.Coordinate;
import com.andy.Grid;

public interface Direction {
    void turnRight(Grid grid);
    void turnLeft(Grid grid);
    Coordinate getCoordinate();
}
