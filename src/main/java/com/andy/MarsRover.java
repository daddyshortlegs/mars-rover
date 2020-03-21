package com.andy;

class MarsRover {
    private Grid grid;
    private RoverCommandFactory roverCommandFactory = new RoverCommandFactory();

    public MarsRover(Grid grid) {
        this.grid = grid;
    }

    public String execute(String commands) {
        for (String command : commands.split("")) {
            roverCommandFactory.executeCommand(command, grid);
        }

        return grid.toString();
    }
}

