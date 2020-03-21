package com.andy;

class MarsRover {
    private final Grid grid;
    private Position position = new Position();
    private RoverCommandFactory roverCommandFactory = new RoverCommandFactory();

    public MarsRover(Grid grid) {
        this.grid = grid;
    }

    public String execute(String commands) {
        for (String command : commands.split("")) {
            roverCommandFactory.executeCommand(command, position);
        }

        return position.toString();
    }
}

