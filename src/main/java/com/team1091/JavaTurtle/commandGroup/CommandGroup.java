package com.team1091.JavaTurtle.commandGroup;

import com.team1091.JavaTurtle.StatusCode;
import com.team1091.JavaTurtle.Turtle;
import com.team1091.JavaTurtle.command.root.Command;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CommandGroup implements Command {
    private final Queue<Command> commands;
    private Queue<Command> commandQueue;

    public CommandGroup(Queue<Command> commands) {
        this.commands = commands;
        this.commandQueue = this.commands;
    }

    public CommandGroup(Command... commands) {
        this.commands = new LinkedList<>(List.of(commands));
        this.commandQueue = this.commands;
    }

    @Override
    public StatusCode apply(Turtle t, double dt) {
        final var commandToExecute = commandQueue.peek();
        if (commandToExecute != null) {
            final var status = commandToExecute.apply(t, t.dt);
            if(status == StatusCode.FINISHED) {
                commandToExecute.reset();
                commandQueue.poll();
            }
        }

        if(commandQueue.isEmpty()) {
            return StatusCode.FINISHED;
        }

        return StatusCode.IN_PROGRESS;
    }

    @Override
    public void reset() {
        commandQueue = new LinkedList<>(commands);
    }
}
