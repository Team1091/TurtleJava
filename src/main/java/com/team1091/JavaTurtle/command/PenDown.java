package com.team1091.JavaTurtle.command;

import com.team1091.JavaTurtle.command.root.Pen;

public class PenDown extends Pen implements Command {
    public PenDown() {
        super(true);
    }
}
