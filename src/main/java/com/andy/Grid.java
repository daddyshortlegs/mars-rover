package com.andy;

class Grid {
    private final Coordinate coordinate = new Coordinate(0, 0);;
    private Compass compass = Compass.North;

    void turnRight() {
        compass = compass.turnRight();
    }

    public void turnLeft() {
        compass = compass.turnLeft();
    }

    public void move() {
        coordinate.add(compass.getCoordinate());
    }

    @Override
    public String toString() {
        return coordinate.getX() + ":" + coordinate.getY() + ":" + compass.toString();
    }
}
