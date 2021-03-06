package com.team1091.JavaTurtle.command.root;

import com.team1091.JavaTurtle.StatusCode;
import com.team1091.JavaTurtle.Turtle;

public class Drive implements Command {

    private final double distance;
    private double distanceTraveled = 0;

    private final double stepSize = 10;

    public Drive(double distance) {
        this.distance = distance;
    }

    @Override
    public StatusCode apply(Turtle t, double dt) {
        double distTraveledNow = Math.min(dt * stepSize, distance - distanceTraveled);
        distanceTraveled += distTraveledNow;

        t.x += Math.cos(t.facing) * distTraveledNow;
        t.y += Math.sin(t.facing) * distTraveledNow;

        if (distanceTraveled >= distance) {
            return StatusCode.FINISHED;
        }

        return StatusCode.IN_PROGRESS;
    }

    @Override
    public void reset() {
        distanceTraveled = 0;
    }

    @Override
    public String name() {
        return "Drive";
    }
}
