package com.design.patterns.decorator.customs;

import com.design.patterns.decorator.Cafe;
import com.design.patterns.decorator.CafeDecorator;

import java.math.BigDecimal;

public class Milk extends CafeDecorator {
    public Milk(Cafe cafe) {
        super(cafe);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(getPriceUnit());
    }

    public static BigDecimal getPriceUnit() {
        return BigDecimal.valueOf(1.5);
    }
}
