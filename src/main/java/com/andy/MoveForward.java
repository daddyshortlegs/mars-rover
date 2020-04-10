package com.andy;

class MoveForward implements Command {
    public void execute(Grid grid) {
        grid.move();
    }
}
