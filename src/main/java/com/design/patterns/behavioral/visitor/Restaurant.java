package com.design.patterns.behavioral.visitor;

import com.design.patterns.behavioral.visitor.visitor.Visitor;

public class Restaurant extends Client {
    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
