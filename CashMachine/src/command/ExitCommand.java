package com.somejavatasks.test.command;

import com.somejavatasks.test.ConsoleHelper;
import com.somejavatasks.test.exception.InterruptOperationException;

public class ExitCommand implements Command{
    public static boolean isExit = false;
    @Override
    public void execute() throws InterruptOperationException {
        System.out.println("You really want to exit(y/n)? press yes(y) or no(n)");
        String answer = ConsoleHelper.readString();
        if ("y".equalsIgnoreCase(answer)){
            System.out.println("bye-bye");
            isExit = true;
        }
    }
}
