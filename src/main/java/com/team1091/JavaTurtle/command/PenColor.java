package com.team1091.JavaTurtle.command;

import com.team1091.JavaTurtle.command.root.Pen;

public class PenColor extends Pen implements Command {
    public PenColor(float[] color) {
        super(color);
    }
}
