package com.andy;

class LeftCommand implements Command {
    public void execute(Position position) {
        position.turnLeft();
    }
}
