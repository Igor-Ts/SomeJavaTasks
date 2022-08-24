package com.somejavatasks.test.command;

import com.somejavatasks.test.Operation;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    public static Map<Operation, Command> operationCommandMap = new HashMap<>();

    static {
        operationCommandMap.put(Operation.DEPOSIT, new DepositCommand());
        operationCommandMap.put(Operation.INFO, new InfoCommand());
        operationCommandMap.put(Operation.WITHDRAW, new WithdrawCommand());
        operationCommandMap.put(Operation.EXIT, new ExitCommand());
    }

    public static void execute(Operation operation){
        operationCommandMap.get(operation).execute();
    }
}
