package com.somejavatasks.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CurrencyManipulatorFactory {
    private static Map<String, CurrencyManipulator> manipulatorMap = new HashMap<>();

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
        CurrencyManipulator currencyManipulator;
        if (manipulatorMap.containsKey(currencyCode)) {
            return manipulatorMap.get(currencyCode);
        } else {
            currencyManipulator = new CurrencyManipulator(currencyCode);
            manipulatorMap.put(currencyCode,currencyManipulator);
            return manipulatorMap.get(currencyCode);
        }
    }

    public static Collection<CurrencyManipulator> getAllCurrencyManipulators(){

        return manipulatorMap.values();
    }
}
