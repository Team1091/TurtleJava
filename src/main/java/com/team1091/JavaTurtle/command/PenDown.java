package com.team1091.JavaTurtle.command;

import com.team1091.JavaTurtle.command.root.Command;
import com.team1091.JavaTurtle.command.root.PenState;

public class PenDown extends PenState implements Command {
    public PenDown() {
        super(true);
    }
}
