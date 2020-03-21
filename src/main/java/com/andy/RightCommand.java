package com.andy;

class RightCommand implements Command {
    public void execute(Position position) {
        position.turnRight();
    }
}
