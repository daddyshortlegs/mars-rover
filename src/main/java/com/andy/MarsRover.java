package com.andy;

class MarsRover {
    private final Grid grid;
    private Bearing bearing = new Bearing();
    Coordinate coordinate = new Coordinate(0, 0);

    public MarsRover(Grid grid) {
        this.grid = grid;
    }

    public String execute(String commands) {
        int numberOfMoves = 0;
        String[] splitCommands = commands.split("");
        for (String command : splitCommands) {
            Coordinate direction = bearing.getCoordinate();

            if (command.equals("M")) {
                coordinate.add(direction);
            } else if (command.equals("R")) {
                bearing.turnRight();
            } else if (command.equals("L")) {
                bearing.turnLeft();
            }
        }

        return coordinate.getX() + ":" + coordinate.getY() + ":" + bearing;
    }
}

