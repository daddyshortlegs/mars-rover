package com.andy;

enum Compass {
    North("N"), East("E"), South("S"), West("W");

    private final String direction;

    Compass(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return direction;
    }
}
