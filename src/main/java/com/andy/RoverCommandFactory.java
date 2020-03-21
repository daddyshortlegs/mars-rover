package com.andy;

import java.util.HashMap;
import java.util.Map;

class RoverCommandFactory {
    private final Map<String, Command> commands = new HashMap<>();

    RoverCommandFactory() {
        commands.put("M", new MoveCommand());
        commands.put("R", new RightCommand());
        commands.put("L", new LeftCommand());
    }

    public Command getCommand(String theCommand) {
        return commands.get(theCommand);
    }
}
