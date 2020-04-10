package com.andy;

public interface Direction {
    void turnRight(Grid grid);
    void turnLeft(Grid grid);
    Coordinate getCoordinate();
}
