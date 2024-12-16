package com.design.patterns.Facade.example1;

public class Main {
    public static void main(String[] args) {
        // Encapsulating the complex system by a facade
        ExecuterSQL executer = new ExecuterSQL("SQL.sql");
        executer.execute();
    }
}
