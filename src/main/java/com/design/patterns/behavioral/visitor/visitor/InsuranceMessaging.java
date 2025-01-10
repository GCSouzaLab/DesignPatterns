package com.design.patterns.behavioral.visitor.visitor;

import com.design.patterns.behavioral.visitor.Bakery;
import com.design.patterns.behavioral.visitor.Bank;
import com.design.patterns.behavioral.visitor.Company;
import com.design.patterns.behavioral.visitor.Restaurant;

public class InsuranceMessaging implements Visitor {
    @Override
    public void visit(Bakery bakery) {
        System.out.println("Insurance messaging for bakery");
    }

    @Override
    public void visit(Bank bank) {
        System.out.println("Insurance messaging for bank");
    }

    @Override
    public void visit(Restaurant restaurant) {
        System.out.println("Insurance messaging for restaurant");
    }

    @Override
    public void visit(Company company) {
        System.out.println("Insurance messaging for company");
    }
}
