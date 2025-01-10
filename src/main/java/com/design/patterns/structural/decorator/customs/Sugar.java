package com.design.patterns.structural.decorator.customs;

import com.design.patterns.structural.decorator.Cafe;
import com.design.patterns.structural.decorator.CafeDecorator;

import java.math.BigDecimal;

public class Sugar extends CafeDecorator {

    public Sugar(Cafe cafe) {
        super(cafe);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(getPriceUnit());
    }

    public static BigDecimal getPriceUnit() {
        return BigDecimal.valueOf(0.5);
    }
}
