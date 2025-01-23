package com.ashokit.designpattern.creation.Singtone;

public class SingltonDemoExample {

    public static void main(String[] args) {

        SingltoneDemo s1=   SingltoneDemo.getInstance();
        System.out.println(s1.hashCode());;

        SingltoneDemo s2=   SingltoneDemo.getInstance();
        System.out.println(s2.hashCode());;
    }
}
