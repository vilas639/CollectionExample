package com.ashokit.senariobased.oops;


public class ExpensiveResource {
   private static ExpensiveResource instance;

   ExpensiveResource() {}

   public static synchronized ExpensiveResource getInstance() {
       if (instance == null) {
           instance = new ExpensiveResource();
       }
       return instance;
   }
}