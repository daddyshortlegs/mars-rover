package com.andy;

import java.util.HashMap;
import java.util.Map;

class RoverCommandFactory {
    private final Map<String, Command> commands = new HashMap<>();

    RoverCommandFactory() {
        commands.put("M", new MoveForward());
        commands.put("R", new TurnRight());
        commands.put("L", new TurnLeft());
    }

    void executeCommand(String textCommand, Grid grid) {
        Command command = commands.get(textCommand);
        if (command != null) {
            command.execute(grid);
        }
    }
}
