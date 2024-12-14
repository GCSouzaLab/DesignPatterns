package com.design.patterns.Singleton;

public class main {
    public static void main(String[] args) {
        main m = new main();
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
