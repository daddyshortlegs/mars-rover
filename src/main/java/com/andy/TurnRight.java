package com.andy;

class TurnRight implements Command {
    public void execute(Grid grid) {
        grid.turnRight();
    }
}
