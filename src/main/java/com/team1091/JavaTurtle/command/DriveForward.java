package com.team1091.JavaTurtle.command;

import com.team1091.JavaTurtle.command.root.Command;
import com.team1091.JavaTurtle.command.root.Drive;

public class DriveForward extends Drive implements Command {
    public DriveForward(double distance) {
        super(distance);
    }

    @Override
    public String name() {
        return "DriveForward";
    }
}
