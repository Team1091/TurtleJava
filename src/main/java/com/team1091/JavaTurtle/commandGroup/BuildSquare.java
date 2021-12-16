package com.team1091.JavaTurtle.commandGroup;

import com.team1091.JavaTurtle.command.*;

public class BuildSquare extends CommandGroup {
    public BuildSquare(double size) {
        super(
                new CommandMultiplier(4,
                        new DriveForward(size),
                        new TurnRight(90)
                )
        );
    }

    @Override
    public String name() {
        return "In BuildSquare:\n\t" + super.name();
    }
}
