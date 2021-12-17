package com.team1091.JavaTurtle.commandGroup;

import com.team1091.JavaTurtle.command.*;

public class Triangle extends CommandGroup {
    public Triangle(double size) {
        super(
                new CommandMultiplier(3,
                        new DriveForward(size),
                        new TurnRight(120)
                )
        );
    }

    @Override
    public String name() {
        return "In triangle:\n\t" + super.name();
    }
}
