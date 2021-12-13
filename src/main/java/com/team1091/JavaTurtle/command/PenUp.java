package com.team1091.JavaTurtle.command;

import com.team1091.JavaTurtle.command.root.Pen;

public class PenUp extends Pen implements Command {
    public PenUp() {
        super(false);
    }
}

