package com.ashokit.designpattern.behaviours.chainofresponsibilty;

public class ChainOfResponsibilityDemo {

/*
Logging: In logging frameworks, messages can pass through different loggers with different severities (e.g., info, warn, error).
Authentication: In authentication systems, the request can pass through multiple levels (e.g., password check, two-factor authentication, CAPTCHA).
 */
    public static void main(String[] args) {
        // Create the handlers
        SupportHandler level1 = new Level1Handler();
        SupportHandler level2 = new Level2Handler();
        SupportHandler level3 = new Level3Handler();

        // Set up the chain of responsibility
        level1.setNext(level2);
        level2.setNext(level3);

        // Test the request handling
        System.out.println("Test Case 1: Password reset");
        level1.handleRequest("Password reset");

        System.out.println("\nTest Case 2: Account locked");
        level1.handleRequest("Account locked");

        System.out.println("\nTest Case 3: Server down");
        level1.handleRequest("Server down");

        System.out.println("\nTest Case 4: Unknown issue");
        level1.handleRequest("Unknown issue");
    }
}


interface SupportHandler {
    void setNext(SupportHandler handler);
    void handleRequest(String issue);
}

class Level1Handler implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNext(SupportHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String issue) {
        if (issue.equalsIgnoreCase("Password reset")) {
            System.out.println("Level 1: Handling password reset request.");
        } else {
            System.out.println("Level 1: Can't handle this request. Passing to Level 2...");
            if (nextHandler != null) {
                nextHandler.handleRequest(issue);
            }
        }
    }
}

class Level2Handler implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNext(SupportHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String issue) {
        if (issue.equalsIgnoreCase("Account locked")) {
            System.out.println("Level 2: Handling account locked request.");
        } else {
            System.out.println("Level 2: Can't handle this request. Passing to Level 3...");
            if (nextHandler != null) {
                nextHandler.handleRequest(issue);
            }
        }
    }
}

class Level3Handler implements SupportHandler {
    @Override
    public void setNext(SupportHandler handler) {
        // No further handler as this is the last level
    }

    @Override
    public void handleRequest(String issue) {
        if (issue.equalsIgnoreCase("Server down")) {
            System.out.println("Level 3: Handling server down request.");
        } else {
            System.out.println("Level 3: Can't handle this request. Request unhandled.");
        }
    }
}

