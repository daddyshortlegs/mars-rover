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
        checkBoundaries();
    }

    private void checkBoundaries() {
        if (coordinate.getX() > 9) coordinate.setX(0);
        if (coordinate.getX() < 0) coordinate.setX(9);
        if (coordinate.getY() > 9) coordinate.setY(0);
        if (coordinate.getY() < 0) coordinate.setY(9);
    }

    @Override
    public String toString() {
        return coordinate.getX() + ":" + coordinate.getY() + ":" + direction.toString();
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
