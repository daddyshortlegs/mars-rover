package com.andy;

class LeftCommand implements Command {
    public void execute(Grid grid) {
        grid.turnLeft();
    }
}
