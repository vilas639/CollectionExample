package com.ashokit.collectionall.introduction;

import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class VectorExampl {


    public static void main(String[] args) {

        Vector v= new Vector();
        System.out.println(v.size());
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        v.add(70);
        v.add(60);
        v.add(70);
        v.add(60);
        v.add(70);
        v.add(60);
        v.add(70);
        v.add(60);
        v.add(70);
        System.out.println(v.size());
        v.remove(5);
        v.get(2);
        System.out.println(v);

        System.out.println(v.capacity());

        Vector v1= new Vector();

       // CopyOnWriteArrayList v1= new CopyOnWriteArrayList();

         Thread t1= new Thread(() -> {

             for (int i = 0; i < 10; i++) {
                 v.add(i);
                 System.out.println("Added: " + i);
                 try
                 {
                    Thread.sleep(100);
                 }catch (Exception e)
                 {
                     Thread.currentThread().interrupt();
                 }
             }

         });



         Thread t2=new Thread(() -> {

             try
             {
                 Thread.sleep(50);
             }
             catch (Exception e)
             {
                 Thread.currentThread().interrupt();
             }

             for (int i = 0; i < 10; i++) {

                 System.out.println("get"+v.get(i));

                 try
                 {
                     Thread.sleep(150);
                 }
                 catch (Exception e)
                 {
                     Thread.currentThread().interrupt();
                 }
             }

         });

         t1.start();
         t2.start();

         try
         {
             t1.join();
             t2.join();
         }
         catch (Exception e)
         {
             Thread.currentThread().interrupt();
         }

    }
}
