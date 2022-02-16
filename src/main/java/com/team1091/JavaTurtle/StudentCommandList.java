package com.team1091.JavaTurtle;

import com.team1091.JavaTurtle.command.*;
import com.team1091.JavaTurtle.command.root.Command;
import com.team1091.JavaTurtle.command.root.PenColor;
import com.team1091.JavaTurtle.commandGroup.BuildSquare;
import com.team1091.JavaTurtle.commandGroup.CommandMultiplier;
import com.team1091.JavaTurtle.commandGroup.Triangle;

import java.util.List;
import java.util.Queue;

public class StudentCommandList {
    public static void make(Queue<Command> commandList) {
        //Here is an example of a turtle command list that draws a dotted / dashed line...
        //What can you make the turtle do?

        var runner = 1000f;

        commandList.addAll(List.of(
                new PenDown()
        ));
        int degrees=0;
        while (degrees < 360) {
            commandList.addAll(
                    List.of(
                            new DriveForward(1),
                            new TurnRight(1)
                    )
            );
            degrees++;
        }
        commandList.addAll(List.of(
                new PenUp(),
                new DriveForward(140),
                new PenDown())
        );
        degrees=0;
        while (degrees < 360) {
            commandList.addAll(
                    List.of(
                            new DriveForward(1),
                            new TurnRight(1)
                    )
            );
            degrees++;
        }
        commandList.addAll(List.of(
                new TurnRight(90),
                new PenUp(),
                new DriveForward(115),
                new PenDown(),
                new DriveForward(200)
                ));
    }
}
