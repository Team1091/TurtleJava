package com.team1091.JavaTurtle.command;

import com.team1091.JavaTurtle.command.root.Command;
import com.team1091.JavaTurtle.command.root.PenState;

public class PenUp extends PenState implements Command {
    public PenUp() {
        super(false);
    }

    @Override
    public String name() {
        return "PenUp";
    }
}

