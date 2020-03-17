package com.andy;

class Bearing {
    Compass compass = Compass.North;

    void turnRight() {
        if (compass == Compass.North) {
            compass = Compass.East;
        } else if (compass == Compass.East) {
            compass = Compass.South;
        }
    }

    @Override
    public String toString() {
        return compass.toString();
    }
}
