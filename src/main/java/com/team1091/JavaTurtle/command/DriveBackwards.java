package com.team1091.JavaTurtle.command;

import com.team1091.JavaTurtle.command.root.Command;
import com.team1091.JavaTurtle.command.root.Drive;

public class DriveBackwards extends Drive implements Command {
    public DriveBackwards(double distance) {
        super(-distance);
    }

    @Override
    public String name() {
        return "DriveBackwards";
    }
}
