package com.somejavatasks.test;

import com.somejavatasks.test.command.CommandExecutor;
import com.somejavatasks.test.command.ExitCommand;
import com.somejavatasks.test.exception.InterruptOperationException;

import java.util.Locale;

public class CashMachine {
    public static void main(String[] args) {
        try {
            Locale.setDefault(Locale.ENGLISH);
            Operation operation;
            do {
                operation = ConsoleHelper.askOperation();
                CommandExecutor.execute(operation);
            }
            while (operation != Operation.EXIT || !ExitCommand.isExit);

        } catch (InterruptOperationException e) {
            ConsoleHelper.writeMessage("bye-bye");
        }
        }

}
