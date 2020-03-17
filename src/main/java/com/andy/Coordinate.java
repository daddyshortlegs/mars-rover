package com.andy;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void add(Coordinate direction) {
        x += direction.getX();
        y += direction.getY();
        if (y > 9) y = 0;
    }
}
