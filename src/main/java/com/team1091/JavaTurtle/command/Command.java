package com.team1091.JavaTurtle.command;
import com.team1091.JavaTurtle.StatusCode;
import com.team1091.JavaTurtle.Turtle;

public interface Command {
    StatusCode apply(Turtle t, double dt);
    void reset();
}
