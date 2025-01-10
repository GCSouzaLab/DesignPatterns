package com.design.patterns.structural.decorator.customs;

import com.design.patterns.structural.decorator.Cafe;
import com.design.patterns.structural.decorator.CafeDecorator;

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
