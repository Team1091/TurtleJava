package com.team1091.JavaTurtle.command.root;

import com.team1091.JavaTurtle.StatusCode;
import com.team1091.JavaTurtle.Turtle;

public class PenSize implements Command {
    private final float state;

    public PenSize(float state) {
        this.state = state;
    }

    @Override
    public StatusCode apply(Turtle t, double dt) {
        t.penSize = state;

        return StatusCode.FINISHED;
    }

    @Override
    public void reset() {}
}
