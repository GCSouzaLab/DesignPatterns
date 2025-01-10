package com.design.patterns.creational.singleton;

public class SingletonApplication {
    public static void main(String[] args) {
        SingletonApplication m = new SingletonApplication();
        m.recordingTheStartOfTheProgram();

        Logger log = Logger.getInstance();
        log.print("Hi, I do not need to instance a new object of logger");

        m.recordTheEndOfTheProgram();
    }

    public void recordingTheStartOfTheProgram() {
        Logger log = Logger.getInstance();
        log.print("Starting the program...");
    }

    public void recordTheEndOfTheProgram() {
        Logger log = Logger.getInstance();
        log.print("Ending the program...");
    }

}
