package com.team1091.JavaTurtle.command.root;

import com.team1091.JavaTurtle.StatusCode;
import com.team1091.JavaTurtle.Turtle;

public class Turn implements Command {

    final double turn;
    double distanceTurned = 0;

    private double stepSize = 30.0;

    public Turn(double turn) {
        this.turn = turn;
    }

    @Override
    public StatusCode apply(Turtle t, double dt) {
            final var distanceTurnedNow = Math.min(dt * stepSize, turn - distanceTurned);
            distanceTurned += distanceTurnedNow;

            t.facing += Math.toRadians(distanceTurnedNow);

            if (distanceTurned >= turn) {
                return StatusCode.FINISHED;
            }

            return StatusCode.IN_PROGRESS;
    }

    @Override
    public void reset() {
        distanceTurned = 0;
    }
}
