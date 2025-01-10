package com.design.patterns.structural.facade.example1;

public class FacadeApplication1 {
    public static void main(String[] args) {
        // Encapsulating the complex system by a facade
        ExecuterSQL executer = new ExecuterSQL("SQL.sql");
        executer.execute();
    }
}
