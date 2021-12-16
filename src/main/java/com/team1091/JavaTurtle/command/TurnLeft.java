package com.team1091.JavaTurtle.command;

import com.team1091.JavaTurtle.StatusCode;
import com.team1091.JavaTurtle.Turtle;
import com.team1091.JavaTurtle.command.root.Command;

public class TurnLeft implements Command {
    private final double goal;
    private double traveled;

    private final double step = 30.0;

    public TurnLeft(double turn) {
        this.goal = turn;
    }

    public StatusCode apply(Turtle t, double dt) {
        double distanceTurnedNow = Math.min(dt * step, goal - traveled);
        traveled += distanceTurnedNow;

        t.facing -= Math.toRadians(distanceTurnedNow);

        if (traveled >= goal)
            return StatusCode.FINISHED;

        return StatusCode.IN_PROGRESS;
    }

    @Override
    public void reset() {
        traveled = 0;
    }

    @Override
    public String name() {
        return "TurnLeft";
    }
}
