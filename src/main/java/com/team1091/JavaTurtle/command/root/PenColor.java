package com.team1091.JavaTurtle.command.root;

import com.team1091.JavaTurtle.StatusCode;
import com.team1091.JavaTurtle.Turtle;

public class PenColor implements Command {
    private final float[] color;

    public PenColor(float[] color) {
        this.color = color;
    }

    @Override
    public StatusCode apply(Turtle t, double dt) {
        t.penColor = color;

        return StatusCode.FINISHED;
    }

    @Override
    public void reset() {}
}
