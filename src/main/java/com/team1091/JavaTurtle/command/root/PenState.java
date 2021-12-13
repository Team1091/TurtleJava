package com.team1091.JavaTurtle.command.root;

import com.team1091.JavaTurtle.StatusCode;
import com.team1091.JavaTurtle.Turtle;

public class PenState implements Command {
    private final boolean state;

    public PenState(boolean state) {
        this.state = state;
    }

    @Override
    public StatusCode apply(Turtle t, double dt) {
        t.penState = state;

        return StatusCode.FINISHED;
    }

    @Override
    public void reset() {}
}
