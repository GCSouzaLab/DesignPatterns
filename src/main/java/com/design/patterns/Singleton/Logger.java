package com.design.patterns.Singleton;

import java.util.Objects;

public class Logger {

    private static Logger instance;

    // Forbiding new instantiation of Logger
    private Logger() {}

    public static Logger getInstance() {
        if (Objects.isNull(instance))
            return new Logger();
        return instance;
    }

    public void print(String msg) {
        // Here we could write the message into a file...
        System.out.println(msg);
    }
}
