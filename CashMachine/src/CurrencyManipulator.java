package com.somejavatasks.test;

import java.util.HashMap;
import java.util.Map;

public class CurrencyManipulator {

    public String currencyCode;
    private Map<Integer, Integer> denominations = new HashMap<>();

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void addAmount(int denomination, int count) {
        if (denominations.containsKey(denomination))
            denominations.put(denomination, denominations.get(denomination) + count);
        else
            denominations.put(denomination, count);
    }

    public int getTotalAmount() {
        int result = 0;
        for (Map.Entry<Integer, Integer> maps : denominations.entrySet()) {
            result += (maps.getKey() * maps.getValue());
        }
        return result;
    }

    public boolean hasMoney() {
        return denominations.isEmpty();
    }
}
