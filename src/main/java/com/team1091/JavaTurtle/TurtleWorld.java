package com.team1091.JavaTurtle;

import com.team1091.JavaTurtle.command.*;
import com.team1091.JavaTurtle.command.root.Command;
import com.team1091.JavaTurtle.commandGroup.BuildSquare;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PGraphics;
import processing.core.PImage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TurtleWorld extends PApplet {
    // These are variables in our instance of TurtleSim
    PImage turtleImage;           // This is the picture of a turtle that we draw
    PGraphics background;         // this is our drawing
    ArrayList<Turtle> turtleList = new ArrayList<>(); // this is a list of each turtle that we are using to draw

    @Override
    public void settings() {
        width = 1366;
        height = 768;
        size(width, height);
    }

    // Setup runs after everything is set up, but before we start looping
    @Override
    public void setup() {
        turtleImage = loadImage("turtle.png");
        background = createGraphics(width, height);
        background.beginDraw();
        background.background(230);
        background.endDraw();

        // START HERE

        // Lets make a new turtle that generates a dotted line
        final Queue<Command> commandList = new LinkedList<>();

        commandList.add(new PenDown());
        commandList.add(new BuildSquare(25));
        for (int i = 0; i < 5; i++) {
            commandList.add(new PenDown());
            commandList.add(new DriveForward(10));
            commandList.add(new PenUp());
            commandList.add(new DriveForward(10));
        }

        turtleList.add(
                new Turtle(
                        200f,
                        100f,
                        0,
                        commandList
                )
        );
        // END HERE
    }

    // The program keeps hitting this each time it wants a new frame.
    // There is a loop calling this method
    @Override
    public void draw() {

        // Draw the background
        imageMode(PConstants.CORNER);
        image(background, 0f, 0f);

        // Loop over the turtles, rendering them all
        for(var turtle : turtleList) {
            final var oldX = turtle.x;
            final var oldY = turtle.y;

            // This code executes the current turtle's commands
            final var commandToExecute = turtle.commands.peek();
            if (commandToExecute != null) {
                final var status = commandToExecute.apply(turtle, turtle.dt);
                if(status == StatusCode.FINISHED) {
                    commandToExecute.reset();
                    turtle.commands.poll();
                }
            }

            // if the pen is down, we can draw
            if (turtle.penState) {
                background.beginDraw();
                background.stroke(turtle.penColor[0], turtle.penColor[1], turtle.penColor[2]);
                background.strokeWeight(1);
                background.line(oldX, oldY, turtle.x, turtle.y);
                background.endDraw();
            }

            // This renders the turtles
            imageMode(CENTER);
            pushMatrix();
            translate(turtle.x, turtle.y);
            rotate((float) (turtle.facing + Math.PI / 2.0));
            image(turtleImage, 0f, 0f);
            popMatrix();
        }
    }
}
