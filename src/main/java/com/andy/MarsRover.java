package com.andy;

import java.util.HashMap;
import java.util.Map;

class MarsRover {
    private final Grid grid;
    private Position position = new Position();

    public MarsRover(Grid grid) {
        this.grid = grid;
    }

    public String execute(String commands) {
        Map<String, Command> theCommands = new HashMap<>();
        theCommands.put("M", new MoveCommand());
        theCommands.put("R", new RightCommand());
        theCommands.put("L", new LeftCommand());

        String[] splitCommands = commands.split("");
        for (String command : splitCommands) {
            Command command1 = theCommands.get(command);
            if (command1 != null) {
                command1.execute(position);
            }
        }

        return position.toString();
    }

}

