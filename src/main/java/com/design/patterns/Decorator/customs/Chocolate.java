package com.design.patterns.Decorator.customs;

import com.design.patterns.Decorator.Cafe;
import com.design.patterns.Decorator.CafeDecorator;

import java.math.BigDecimal;

public class Chocolate extends CafeDecorator {
    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(getPriceUnit());
    }

    public BigDecimal getPriceUnit() {
        return BigDecimal.valueOf(4.0);
    }
}
