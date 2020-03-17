package com.andy;

class Bearing {
    Compass compass = Compass.North;

    void turnRight() {
        if (compass == Compass.North) {
            compass = Compass.East;
        }
    }

    @Override
    public String toString() {
        return compass.toString();
    }
}
