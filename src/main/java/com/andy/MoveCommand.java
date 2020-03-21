package com.andy;

class MoveCommand implements Command {
    public void execute(Grid grid) {
        grid.move();
    }
}
