package com.team1091.JavaTurtle.command;

import com.team1091.JavaTurtle.command.root.Command;
import com.team1091.JavaTurtle.command.root.Turn;

public class TurnRight extends Turn implements Command {
    public TurnRight(double turn) {
        super(turn);
    }
}
