package com.design.patterns.decorator.customs;

import com.design.patterns.decorator.Cafe;
import com.design.patterns.decorator.CafeDecorator;

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
