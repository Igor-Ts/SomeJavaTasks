package com.somejavatasks.test;

import java.util.Locale;

public class CashMachine {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        CurrencyManipulator eu = new CurrencyManipulator("EUR");
        String[] eue = ConsoleHelper.getValidTwoDigits(ConsoleHelper.askCurrencyCode());
        eu.addAmount(Integer.parseInt(eue[0]), Integer.parseInt(eue[1]));
        System.out.println(eu.getTotalAmount());
    }
}
