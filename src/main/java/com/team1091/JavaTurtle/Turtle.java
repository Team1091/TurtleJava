package com.team1091.JavaTurtle;

import com.team1091.JavaTurtle.command.root.Command;

import java.util.LinkedList;
import java.util.Queue;

//public class Turtle {
//    double x; // fields in here need to be set when you create an instance,
//    double y;
//    double facingDegrees; // Notice how this does not have var before it?  That means its not saved, just used.  Take a look at facing below
//    boolean penDown = true;  // This is a default.  If you dont set it, it will be true
//    final ArrayList<Command> commands = new ArrayList<>();
//
//    public Turtle(double v, double v1, double v2, ArrayList<Command> commands) {
//
//    }
//}

public class Turtle {
    public float x;
    public float y;
    public double facing;
    public boolean penState;
    public float[] penColor = {0, 0, 0};
    public float penSize;
    public Queue<Command> commands;
    public double dt = 50; //Functions as the simulation speed for an individual turtle...

    public Turtle(float x, float y, double facing, boolean pen, Queue<Command> commands) {
        this.x = x;
        this.y = y;
        this.facing = Math.toRadians(facing);
        this.penState = pen;
        this.commands = commands;
    }

    public Turtle(float x, float y, double facing, Queue<Command> commands) {
        this(x, y, facing, false, commands);
    }

    public Turtle() {
        this(0, 0, 0, false, new LinkedList<>());
    }
}