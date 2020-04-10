package com.andy;

class Grid {
    private final Coordinate coordinate = new Coordinate(0, 0);

    private Direction direction = new North();

    void turnRight() {
        direction.turnRight(this);
    }

    public void turnLeft() {
        direction.turnLeft(this);
    }

    public void move() {
        coordinate.add(direction.getCoordinate());
    }

    @Override
    public String toString() {
        return coordinate.getX() + ":" + coordinate.getY() + ":" + direction.toString();
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
