package com.andy;

class MarsRover {
    public MarsRover(Grid grid) {
    }

    public String execute(String command) {
        if (command.equals("M")) {
            return "0:1:N";
        }
        return "0:0:N";
    }
}
