package com.somejavatasks.test.command;

import com.somejavatasks.test.CurrencyManipulator;
import com.somejavatasks.test.CurrencyManipulatorFactory;

public class InfoCommand implements Command{
    @Override
    public void execute() {
        if (CurrencyManipulatorFactory.getAllCurrencyManipulators().isEmpty()){
            System.out.println("No money!");
        }
        for (CurrencyManipulator currency: CurrencyManipulatorFactory.getAllCurrencyManipulators()) {
            if (currency.hasMoney()){
                System.out.println("No money!");
            } else {
                System.out.println(currency.getCurrencyCode() + " - " + currency.getTotalAmount());
            }
        }
    }
}
