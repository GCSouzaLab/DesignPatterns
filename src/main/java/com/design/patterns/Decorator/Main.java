package com.design.patterns.Decorator;

import com.design.patterns.Decorator.customs.Chocolate;
import com.design.patterns.Decorator.customs.Milk;
import com.design.patterns.Decorator.customs.Sugar;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new SimpleCoffee();
        cafe = new Milk(cafe);
        cafe = new Sugar(cafe);

        // Expected output: 7.0
        System.out.println("Coffee with milk and sugar: $" +cafe.getPrice());

        // Expected output: 11.0
        cafe = new Chocolate(cafe);
        System.out.println("Coffee with milk, sugar and chocolate: $" +cafe.getPrice());

        /**
         *  I'd like to remove Sugar from the coffee and after putting chocolate.
         *  But it'd be outside of this pattern.
         */
    }
}
