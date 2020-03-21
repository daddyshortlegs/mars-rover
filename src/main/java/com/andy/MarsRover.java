package com.andy;

class MarsRover {
    private Position position;
    private RoverCommandFactory roverCommandFactory = new RoverCommandFactory();

    public MarsRover(Position position) {
        this.position = position;
    }

    public String execute(String commands) {
        for (String command : commands.split("")) {
            roverCommandFactory.executeCommand(command, position);
        }

        return position.toString();
    }
}

