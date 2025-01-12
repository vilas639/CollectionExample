package com.ashokit.senariobased.oops;

/*

How would you prevent a class from being extended?
Answer:

Declare the class as final:
 */
public class PreventClassExample {

    public static void main(String[] args) {
        FinalClass f= new FinalClass();
        f.display();
    }
}

 final class FinalClass {
    public void display() {
        System.out.println("This class cannot be extended.");
    }
}


