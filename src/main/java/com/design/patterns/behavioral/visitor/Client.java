package com.design.patterns.behavioral.visitor;

import com.design.patterns.behavioral.visitor.visitor.Visitor;

public abstract class Client {
    private String name;
    private String phone;
    private String address;

    abstract void accept(Visitor visitor);
}
