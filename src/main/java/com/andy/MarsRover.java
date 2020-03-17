package com.andy;

class MarsRover {
    public MarsRover(Grid grid) {
    }

    public String execute(String commands) {
        int numberOfMoves = 0;
        String[] splitCommands = commands.split("");
        for (String command : splitCommands) {
            if (command.equals("M")) {
                numberOfMoves++;
            }
        }

        return "0:" + numberOfMoves + ":N";
    }
}
