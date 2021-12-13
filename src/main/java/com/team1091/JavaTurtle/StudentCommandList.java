package com.team1091.JavaTurtle;

import com.team1091.JavaTurtle.command.DriveForward;
import com.team1091.JavaTurtle.command.PenDown;
import com.team1091.JavaTurtle.command.PenUp;
import com.team1091.JavaTurtle.command.root.Command;
import com.team1091.JavaTurtle.commandGroup.BuildSquare;
import com.team1091.JavaTurtle.commandGroup.CommandMultiplier;

import java.util.Queue;

public class StudentCommandList {
    public static void make(Queue<Command> commandList) {
        //Here is an example of a turtle command list that draws a dotted / dashed line...
        //What can you make the turtle do?

        commandList.add(
                new CommandMultiplier(5,
                        new PenDown(),
                        new DriveForward(10),
                        new PenUp(),
                        new DriveForward(10)
                )
        );
    }
}
