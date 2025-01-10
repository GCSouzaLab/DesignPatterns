package com.design.patterns.structural.decorator.customs;

import com.design.patterns.structural.decorator.Cafe;
import com.design.patterns.structural.decorator.CafeDecorator;

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
