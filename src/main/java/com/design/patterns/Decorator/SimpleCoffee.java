package com.design.patterns.Decorator;

import java.math.BigDecimal;

public class SimpleCoffee implements Cafe {
    @Override
    public BigDecimal getPrice() {
        return getPriceUnit();
    }

    public static BigDecimal getPriceUnit() {
        return BigDecimal.valueOf(5.0);
    }
}
