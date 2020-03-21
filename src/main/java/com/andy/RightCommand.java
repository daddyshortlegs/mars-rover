package com.andy;

class RightCommand implements Command {
    public void execute(Grid grid) {
        grid.turnRight();
    }
}
