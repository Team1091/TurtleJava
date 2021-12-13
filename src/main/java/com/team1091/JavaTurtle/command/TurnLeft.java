package com.team1091.JavaTurtle.command;

import com.team1091.JavaTurtle.command.root.Turn;

public class TurnLeft extends Turn implements Command {
    public TurnLeft(double turn) {
        super(-turn);
    }
}
