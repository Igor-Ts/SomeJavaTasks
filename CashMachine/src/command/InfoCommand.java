package com.somejavatasks.test.command;

import com.somejavatasks.test.ConsoleHelper;
import com.somejavatasks.test.CurrencyManipulator;
import com.somejavatasks.test.CurrencyManipulatorFactory;

public class InfoCommand implements Command{
    @Override
    public void execute() {
        if (CurrencyManipulatorFactory.getAllCurrencyManipulators().size() == 0){
            ConsoleHelper.writeMessage("No money!");
        }
        for (CurrencyManipulator currency: CurrencyManipulatorFactory.getAllCurrencyManipulators()) {
            if (currency.hasMoney()){
                ConsoleHelper.writeMessage(currency.getCurrencyCode() + " - " + currency.getTotalAmount());

            } else {
                ConsoleHelper.writeMessage("No money!");
            }
        }
    }
}
