package com.ashokit.basic.fundamentals;

public class StringExample {

    public static void main(String[] args) {
        /*

        String
        String is a class present in java.lang package
        string are immutable onec created objet  can not change.
        store om heap memory

        How many way to creat a String object
        String litral created using double quate
        String litral store in string constant pool
        whenerver create a litrl jvm will check in scp if not then create a string
        if already then it will pointing refernce to save meemory
          -
        new keyword
        using new operaator to create a new String
        jvm will create two object
        1st it will crate in heap area and store the string then pointing the refernce to the object
        2nd it will create litral in scp for future purpose it will not gc jvm will handle itself

        converting converting array into string
         */

       //string refernce
        String s1= "Hellow";
        String s2= "Hellow";

        String s3 = new String("Hellow");

        String s4= new String("Hellow");


        //1 st create a two object 1 str creat  object in heap memory areae and provide refernce s1
        // then it will create string litral in hellow in scp for future prespective
        //2 nd statement creta 1 object in heap memory area and provide refernce s2
        // it will not create litral
        //3rd and 4 th not create a object just poinign refence in scp s3 , s4
        //3 object is created 2 in heap area AND 1 in scp

        char[] j = {'a','b','c','d'};

        String s5= new String(j);

        System.out.println(s5);

        //why is stirg is immutable
        //object is refer to multple refernce
        //if you change the object then pointing refernce also modifyed

        //stingbuffer  - synchronized  , mutable  , theadsafe
        //stringbuilder - not synchrnized  , mutable , non threadsafe
        //String   - imutable
    }
}
