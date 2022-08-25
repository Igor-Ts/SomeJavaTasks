package com.somejavatasks.test.command;

import com.somejavatasks.test.exception.InterruptOperationException;

public interface Command {
    void execute() throws InterruptOperationException;
}
