package com.design.patterns.decorator;

import java.math.BigDecimal;

public abstract class CafeDecorator implements Cafe {
    private final Cafe decoratedCafe;

    public CafeDecorator(Cafe cafe) {
        this.decoratedCafe = cafe;
    }

    @Override
    public BigDecimal getPrice() {
        return decoratedCafe.getPrice();
    }
}
