package com.andy;

class MoveCommand implements Command {
    public void execute(Position position) {
        position.move();
    }
}
