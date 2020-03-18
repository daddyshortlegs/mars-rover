package com.andy;

class MarsRover {
    private final Grid grid;
    Coordinate coordinate = new Coordinate(0, 0);
    private Position position = new Position(coordinate);

    public MarsRover(Grid grid) {
        this.grid = grid;
    }

    public String execute(String commands) {
        String[] splitCommands = commands.split("");
        for (String command : splitCommands) {
            if (command.equals("M")) {
                position.move();
            } else if (command.equals("R")) {
                position.turnRight();
            } else if (command.equals("L")) {
                position.turnLeft();
            }
        }

        return coordinate.getX() + ":" + coordinate.getY() + ":" + position;
    }
}

