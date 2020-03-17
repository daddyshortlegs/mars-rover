package com.andy;

class MarsRover {
    private final Grid grid;
    private Bearing bearing = new Bearing();

    public MarsRover(Grid grid) {
        this.grid = grid;
    }

    public String execute(String commands) {
        int numberOfMoves = 0;
        String[] splitCommands = commands.split("");
        for (String command : splitCommands) {
            if (command.equals("M")) {
                numberOfMoves++;
                if (numberOfMoves > 9) {
                    numberOfMoves = 0;
                }
            } else if (command.equals("R")) {
                bearing.turnRight();
            }
        }

        return "0:" + numberOfMoves + ":" + bearing;
    }
}

