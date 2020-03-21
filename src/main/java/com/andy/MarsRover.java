package com.andy;

class MarsRover {
    private Position position = new Position();
    private RoverCommandFactory roverCommandFactory = new RoverCommandFactory();

    public MarsRover() {

    }

    public String execute(String commands) {
        for (String command : commands.split("")) {
            roverCommandFactory.executeCommand(command, position);
        }

        return position.toString();
    }
}

