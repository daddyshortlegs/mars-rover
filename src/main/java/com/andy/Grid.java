package com.andy;

class Grid {
    private final Coordinate coordinate = new Coordinate(0, 0);;
    private Compass compass = Compass.North;

    private Direction direction = new North();

    void turnRight() {
        direction.turnRight(this);
        compass = compass.turnRight();
    }

    public void turnLeft() {
        direction.turnleft(this);
        compass = compass.turnLeft();
    }

    public void move() {
        coordinate.add(direction.getCoordindate());
    }

    @Override
    public String toString() {
        return coordinate.getX() + ":" + coordinate.getY() + ":" + direction.toString();
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
