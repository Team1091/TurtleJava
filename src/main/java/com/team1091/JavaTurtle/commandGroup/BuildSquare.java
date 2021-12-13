package com.team1091.JavaTurtle.commandGroup;

import com.team1091.JavaTurtle.command.Command;
import com.team1091.JavaTurtle.command.DriveForward;
import com.team1091.JavaTurtle.command.TurnRight;
import com.team1091.JavaTurtle.command.root.Turn;

import java.util.LinkedList;
import java.util.Queue;

public class BuildSquare extends CommandGroup {
    public BuildSquare(double size) {
        super(new CommandMultiplier(4,
                new DriveForward(size),
                new TurnRight(90)
                )
        );
    }
}
