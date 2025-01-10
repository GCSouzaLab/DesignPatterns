package com.design.patterns.behavioral.visitor;

import com.design.patterns.behavioral.visitor.visitor.InsuranceMessaging;
import com.design.patterns.behavioral.visitor.visitor.Visitor;

public class VisitorApplication {
    public static void main(String[] args) {
        Client[] clients = {new Bakery(), new Bank(), new Restaurant()};
        Visitor visitor = new InsuranceMessaging();

        for (Client client : clients) {
            client.accept(visitor);
        }
    }
}
