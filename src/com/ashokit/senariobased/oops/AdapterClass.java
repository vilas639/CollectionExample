package com.ashokit.senariobased.oops;



/*
    Scenario: A third-party library's class needs to be used in your application, but you cannot modify it.
How would you adapt it to meet your application's requirements without directly modifying the class?

     */


 public class AdapterClass implements MyInterface {

     private static ThirdPartyClass thirdParty;



     public AdapterClass(ThirdPartyClass thirdParty) {
         this.thirdParty = thirdParty;
     }


     @Override
     public void performAction() {
         System.out.println("permorme something");
         thirdParty.doSomething();
     }


     public static void main(String[] args) {

         AdapterClass a= new AdapterClass(new ThirdPartyClass());
         a.performAction();
     }

 }

interface MyInterface {
    void performAction();
}


class ThirdPartyClass {



    public void doSomething() {
        System.out.println("Action performed by third-party class");
    }
}