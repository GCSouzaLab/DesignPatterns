package com.design.patterns.behavioral.visitor.visitor;

import com.design.patterns.behavioral.visitor.Bakery;
import com.design.patterns.behavioral.visitor.Bank;
import com.design.patterns.behavioral.visitor.Company;
import com.design.patterns.behavioral.visitor.Restaurant;

public interface Visitor {
    void visit(Bakery bakery);
    void visit(Bank bank);
    void visit(Restaurant restaurant);
    void visit(Company company);
}
