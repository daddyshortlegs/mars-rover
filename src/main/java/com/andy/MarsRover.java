package com.andy;

class MarsRover {
    public MarsRover(Grid grid) {
    }

    public String execute(String commands) {
        int numberOfMoves = 0;
        String[] splitCommands = commands.split("");
        String bearing = "N";
        for (String command : splitCommands) {
            if (command.equals("M")) {
                numberOfMoves++;
                if (numberOfMoves > 9) {
                    numberOfMoves = 0;
                }
            } else if (commands.equals("R")) {
                bearing = "E";
            }
        }

        return "0:" + numberOfMoves + ":" + bearing;
    }
}
