package com.somejavatasks.test.command;

import com.somejavatasks.test.ConsoleHelper;
import com.somejavatasks.test.CurrencyManipulator;
import com.somejavatasks.test.CurrencyManipulatorFactory;
import com.somejavatasks.test.exception.InterruptOperationException;
import com.somejavatasks.test.exception.NotEnoughMoneyException;

public class WithdrawCommand implements Command {
    @Override
    public void execute() throws InterruptOperationException {
        String code = ConsoleHelper.askCurrencyCode();
        CurrencyManipulator currency = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(code);
        while(true) {
            try {
                ConsoleHelper.writeMessage("Please, enter amount of money");
                int amount = Integer.parseInt(ConsoleHelper.readString());
                if (!currency.isAmountAvailable(amount)){
                    ConsoleHelper.writeMessage("Not enough money!");
                    throw new NumberFormatException();
                }
                currency.withdrawAmount(amount);
                break;
            } catch (NumberFormatException e) {
                ConsoleHelper.writeMessage("Incorrect amount");
            } catch (NotEnoughMoneyException e) {
                ConsoleHelper.writeMessage("In cash machine don't have denominations");
            }

            break;

        }
    }
}
