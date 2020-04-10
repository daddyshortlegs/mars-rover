package com.andy;

class TurnLeft implements Command {
    public void execute(Grid grid) {
        grid.turnLeft();
    }
}
