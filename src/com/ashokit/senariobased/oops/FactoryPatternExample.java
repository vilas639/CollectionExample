package com.ashokit.senariobased.oops;

public class FactoryPatternExample {

    public static void main(String[] args) {
        LoggerFactory l= new LoggerFactory();
        l.getLogger("console");
        l.getLogger("file");
    }
}

 interface Logger {
    void log(String message);
}

 class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Console: " + message);
    }
}

 class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("FIle: " + message);
    }
}

 class LoggerFactory {
    public static Logger getLogger(String type) {
        if ("console".equalsIgnoreCase(type)) return new ConsoleLogger();
        if ("file".equalsIgnoreCase(type)) return new FileLogger();
        throw new IllegalArgumentException("Unknown logger type");
    }
}


