package com.ashokit.basic.fundamentals;

public class InterfaceExample  implements InterfaceData1,InterfaceData {


    public static void main(String[] args) {
         /*
        interface
        any service requirement specification is called as interface

        contact between client and service
        clinet point view what is expecting
        service point view what is offerning
        we can achieve security because we hiding the implention
        class can extend one class and any no of interface

        method by defailt public abstarct
        variable alwaay public staic final
        two interface have same variable by using interface.name resolve the issue

        //marker interface
        containt only one method
        serializable, cloanable , single thrad mode

        serilizable -- send object accross n/w and save the object in file/db
        clonable -- copy exact copy of object




         */

        InterfaceExample ab= new InterfaceExample();
        ab.m1();
    }

    @Override
    public void m1() {

        System.out.println(InterfaceData1.a);
        System.out.println("badi badi batte");
    }

    @Override
    public void m1(String n) {

    }


}
