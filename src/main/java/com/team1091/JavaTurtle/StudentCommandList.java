package com.team1091.JavaTurtle;

import com.team1091.JavaTurtle.command.*;
import com.team1091.JavaTurtle.command.root.Command;
import com.team1091.JavaTurtle.command.root.PenColor;
import com.team1091.JavaTurtle.commandGroup.BuildSquare;
import com.team1091.JavaTurtle.commandGroup.CommandMultiplier;
import com.team1091.JavaTurtle.commandGroup.Triangle;

import java.util.Queue;

public class StudentCommandList {
    public static void make(Queue<Command> commandList) {
        //Here is an example of a turtle command list that draws a dotted / dashed line...
        //What can you make the turtle do?

        var runner = 1000f;

        commandList.add(
                new PenDown()
        );

        while(runner > 0) {
            commandList.add(
                    new Triangle(runner)
            );
            commandList.add(
                    new PenColor(new float[]{runner%255,runner%510,runner%768})
            );

            runner = runner - 1;
        }

        int jar;

        for(jar = 1, jar < 100, jar++) {
            //enter more code

        };


    }
}
