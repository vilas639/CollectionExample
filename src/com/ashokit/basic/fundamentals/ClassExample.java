package com.ashokit.basic.fundamentals;

public class ClassExample  extends  AbstractExample{

     final int x=10;
      final int y;
      final int z;
    {
        z=30;
    }

    final static  int m=100;

     static int  n=35;
    ClassExample()
    {
        y=20;
    }

    public static void main(String[] args) {

        /*
        class modiferd in java
        public , deafult ,final , stricfp, abstract

       //inner class level
       public , private , protected , default, abstract , final , static ,strifp
       //method level inner class private, protected, default

       //public class we can access anyware

       //default accec only current package

       //final modified
       //final is keyword applicable on class  method, and variable
       //declare class then we can not creat class
       //declare method then we can not override in the child class
       // declare variable we can not change we have to intialize the value applicabl in localvaraible

       declare final variable at block level , or constructor or intial



        //abstact
        //it modifed applicable on clas and method level not on variable
        //abstract method
        //we can declare abstract method there implementation is responible to chile class
        //abstract class we can create a object
        //


        //strictfp
        //aplicable in classes , method not in variable

        //private
        //acces within a class

        //protected
        //access within packaege from outside using child refernce you can use


        //static
        //applicable on method, variable but not clss only innerclasses
        //value of variable is same for all object then we should go stataic varaible
        //it will create one copy at class level and share that every objecy of the class
        //static varaible access both static and non -static bock


        //native
        //applicable for method only not variable and class level
        //improved performancec of the system
        //use legance of java non code

        //synchronized
        //apllicable only for method and block
        //at time one thread is allowed
        //disaddvantahe it will increase the time

        //transient
        //applicable only in variable
        //if you dont want expose the valu then declare it jvm ill ignore for securty purpose


        //volatie
        //applicble only in variale
        //valotile mean value is keep changed
        /declare volatile every thread separate copy will be created



         */

       final int x=10;

       System.out.println(n);

    }


    @Override
    public int getvechile() {
        System.out.println(n);

        return 0;
    }

    @Override
    public void hi1() {

    }
}

 abstract class AbstractExample {

    public abstract int getvechile();

     public abstract void hi1();

     public final void hi() {
      System.out.println("welcome");
     }
 }
