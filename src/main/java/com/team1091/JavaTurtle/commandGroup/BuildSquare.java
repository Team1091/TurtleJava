package com.team1091.JavaTurtle.commandGroup;

import com.team1091.JavaTurtle.command.DriveForward;
import com.team1091.JavaTurtle.command.TurnRight;

public class BuildSquare extends CommandGroup {
    public BuildSquare(double size) {
        super(
                new CommandMultiplier(4,
                        new DriveForward(size),
                        new TurnRight(90)
                )
        );
    }
}
