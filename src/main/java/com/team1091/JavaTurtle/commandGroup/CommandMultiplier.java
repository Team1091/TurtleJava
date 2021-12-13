package com.team1091.JavaTurtle.commandGroup;

import com.team1091.JavaTurtle.command.Command;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CommandMultiplier extends CommandGroup {

    public CommandMultiplier(int multiplier, Command... commands) {
        super(internalMultiplier(multiplier, commands));
    }

    private static Queue<Command> internalMultiplier(int multiplier, Command... commands) {
        //Super call must be first, so this must all be done in this super secret function!

        Queue<Command> multipliedCommands = new LinkedList<>();

        for(int i = 0; i < multiplier; i++) {
            multipliedCommands.addAll(Arrays.asList(commands));
        }

        return multipliedCommands;
    }
}
