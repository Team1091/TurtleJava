package com.team1091.JavaTurtle.command.root;

import com.team1091.JavaTurtle.StatusCode;
import com.team1091.JavaTurtle.Turtle;
import com.team1091.JavaTurtle.command.Command;

public class Pen implements Command {
    private final boolean state;
    private final boolean modifyState;

    private final float[] color;
    private final boolean modifyColor;

    private Pen(boolean state, boolean modifyState, float[] color, boolean modifyColor) {
        this.state = state;
        this.modifyState = modifyState;
        this.color = color;
        this.modifyColor = modifyColor;
    }

    public Pen(boolean state) {
        this(state, true, new float[]{0, 0, 0}, false);
    }

    public Pen(float[] color) {
        this(false, false, color, true);
    }

    @Override
    public StatusCode apply(Turtle t, double dt) {
        if(modifyState) {
            t.pen = state;
        }

        if(modifyColor) {
            t.penColor = color;
        }

        reset();
        return StatusCode.FINISHED;
    }

    @Override
    public void reset() {}
}
