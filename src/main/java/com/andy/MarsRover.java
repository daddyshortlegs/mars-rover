package com.andy;

class MarsRover {
    private final Grid grid;
    private Position position = new Position();

    public MarsRover(Grid grid) {
        this.grid = grid;
    }

    public String execute(String commands) {

        String[] splitCommands = commands.split("");
        for (String command : splitCommands) {
            Command command1 = getCommand(command);
            if (command1 != null) {
                command1.execute(position);
            }
        }

        return position.toString();
    }

    private Command getCommand(String command) {
        return new RoverCommandFactory().getCommand(command);
    }

}

