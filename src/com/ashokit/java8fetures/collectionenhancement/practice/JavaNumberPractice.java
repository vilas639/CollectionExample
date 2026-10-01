package com.ashokit.java8fetures.collectionenhancement.practice;


import java.util.ArrayList;
import java.util.Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaNumberPractice {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Integer> listnumber= new ArrayList<Integer>();

        listnumber.add(1);
        listnumber.add(2);
        listnumber.add(2);
        listnumber.add(3);
        listnumber.add(4);

//remove duplicate from list and count the sum
      Long number= listnumber.stream()
      .distinct()
      .count();

      System.out.println(number);

        //remove duplicate from list the sum
//      int number= listnumber.stream()
//              .distinct()
//              .mapToInt(Integer::intValue)
//              .sum();
//
//      System.out.println(number);

        //filter  out odd number and squre even number
//      List<Integer> numbereven=    listnumber.stream()
//              .filter(n -> n%2==0)
//              .map(n -> n*n)
//              .collect(Collectors.toList());
//
//      System.out.println(numbereven);


        //revese arre
//      int[] arr= {1,2,3,4};
//      int left=0,right =arr.length-1;
//
//      while(left<right)
//      {
//          int temp=arr[left];
//          arr[left]=arr[right];
//          arr[right]=temp;
//          left++;
//          right--;
//
//      }
//      System.out.println("Reverse Array: "+Arrays.toString(arr));


        //most frequnce
//      int[] arr= {1,2,3,4,1,2,2,3,3,3,4,10,9};
//
//      Map<Integer, Integer> headmap=new HashMap<>();
//
//      for(int num:arr)
//      {
//          headmap.put(num, headmap.getOrDefault(num, 0)+1);
//      }
//
//      int maxfrq=0,mostfreq=-1;
//      for(Map.Entry<Integer, Integer> entry: headmap.entrySet())
//      {
//          if(entry.getValue()>maxfrq)
//          {
//              maxfrq=entry.getValue();
//              mostfreq=entry.getKey();
//          }
//      }
//
//      System.out.println("Most Frequntly "+mostfreq);

        //find the second largest number
//      int[] arr1= {1,2,3,4,1,2,2,3,3,3,4,10,9};
//      int first=Integer.MIN_VALUE;
//      int second=Integer.MIN_VALUE;
//
//      for(int num:arr1)
//      {
//
//          if(num>first)
//          {
//              second=first;
//              first=num;
//          }
//          else if(num >second && num!=first)
//          {
//              second=num;
//          }
//      }
//      System.out.println("Second Largest "+second);


        //find the factorual
//      int factint=5;
//      int fact=IntStream.rangeClosed(1, factint)
//      .reduce(1, (a,b)  -> a*b);
//
//      System.out.println("factoial of   "+factint+" is "+fact);

    }

}
