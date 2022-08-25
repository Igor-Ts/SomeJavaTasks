package com.somejavatasks.test.command;

import com.somejavatasks.test.ConsoleHelper;
import com.somejavatasks.test.CurrencyManipulator;
import com.somejavatasks.test.CurrencyManipulatorFactory;

public class DepositCommand implements Command {
    @Override
    public void execute() {
        String code = ConsoleHelper.askCurrencyCode();
        String[] eue = ConsoleHelper.getValidTwoDigits(code);
        CurrencyManipulator currency = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(code);
        currency.addAmount(Integer.parseInt(eue[0]), Integer.parseInt(eue[1]));
    }
}
