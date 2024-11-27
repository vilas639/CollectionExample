package com.ashokit.basic.oops;

public class OopsExample  extends  P {


    public static void main(String[] args) {
        /*
        piler of oops
        encapsualtion   -  wrap the code and data so only so throw object we used security
        inheritence   - all parent class method and proprty for reusabilty
        polymorpism  - many form   - it uses flexibility for developer creat action

        method overloading  - same name but differnet parammert alway take care at compile time
        method overidring  - same name and same signture use for parent method at runtime
            private method can not override
        method hiding     -- same name and smae signture onky both method should be static
        and consider runtime polymorphsm

        abstraction   -hiding irrelevent feature  and show relevent feature to client


        constructors  - creat and intrilise the object class

        supper  - super is called parent class of contstructor
        this -- this is called current class of constructor

        singtone class - allow to create only object
        instanc of create seperate object will create in single object and reuse memory will utilized
        factory method - by using call name you called method and return same object is called factory methd
        public privat protected and default
         */

        OopsExample oops= new OopsExample();
        oops.m1("vilas");
        oops.m1(1);
        oops.m1("null");


        P o= new P();
        o.m1();

        //factory method
       // Runtime r = Runtime.getRuntime();

    }

    public void m1(String s)
    {
       System.out.println(""+s);
        m2();
    }
    public void m1(Integer n)
    {
        System.out.println(""+n);
    }

    public void m1(Object n1)
    {
        System.out.println(""+n1);
    }

    public void m1()
    {
        System.out.println("s");
    }
}
