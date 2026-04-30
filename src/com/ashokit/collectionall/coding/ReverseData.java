package com.ashokit.collectionall.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReverseData {

	//How to Reverse a String in Java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name="VILAS SAVAJI JADHAAV";
        //System.out.println(revserDataString(name));
        
        String name1="PANAP";
        //System.out.println(checkpallindrome(name1));
        
      //  System.out.println(Nonrepatedchar(name1));
        
        int[] nums = {1, 2, 3, 5, 6, 7, 8,9, 10};
      //  System.out.println(findMissingNumber(nums,10));
        
        
        int[] array = {1, 2, 3,3,4,7, 4, 5, 6, 7, 8, 10};
     //   System.out.println(findduplicate(array));
        
        String str1 = "listen";
        String str2 = "silent";
       // System.out.println(checkAnnagram(str1,str2));
        
        String[] strArr ={"abc","god","cab", "bca", "dog","cat"};  
      //  Output : {"abc","cab", "bca"}{"god","dog"}{"cat"}

        chekMultipleAnagram(strArr);
        
        
	}
	
	
	//convert to chararray while (left<right ) store in temp and return new String
	public  static String revserData(String data)
	{
		char[] reversedata=data.toCharArray();
		 int left=0;
		 int right=reversedata.length-1;
		
		 while(left<right)
		 {
			 char temp=reversedata[left];
			 reversedata[left]=reversedata[right];
			 reversedata[right]=temp;
			 
			 left++;
			 right--;
		 }
		return new String(reversedata);
	}

	
	public static String revserDataString(String data)
	{
		String reverse="";
		for(int i=data.length()-1;i>=0;i--)
		{
			reverse+=data.charAt(i);
		}
		
		return new String(reverse);
	}
	
	public static boolean checkpallindrome(String data)
	{
		int left=0;
		int right=data.length()-1;
		
		while(left<right)
		{
			if(data.charAt(left) !=data.charAt(right)) return false;
			left++;
			right--;
		}
		
		return true;
		
	}
	
	public static char Nonrepatedchar(String name)
	{
		Map<Character,Integer> charcount= new LinkedHashMap<>();
		
		char temp='A';
		for(Character c: name.toCharArray())
		{
			charcount.put(c, charcount.getOrDefault(c, 0)+1);
		}
		
		for( Map.Entry<Character,Integer>  entryset :charcount.entrySet())
		{
			if(entryset.getValue()==1) return entryset.getKey();
		}
		
		throw new RuntimeException("no charcher found");
		
		
	}
	
	
	public static int findMissingNumber(int[] nums, int n) {  
	    int expectedSum = n * (n + 1) / 2; 
	    int actualSum = 0;
	    for (int num : nums) 
	    	{
	    	actualSum += num;
	    	}
	    return expectedSum - actualSum;
	}
	
	public static List<Integer> findduplicate(int[] nums)
	{
	   Set<Integer> set= new HashSet<>();
	   List<Integer> duplicate = new  ArrayList<>();
	   
		for(int num : nums)
		{
			if(!set.add(num))
			{
				duplicate.add(num);
			}
				
		}
		
	return duplicate;
		
	}
	
	public static boolean checkAnnagram(String s1,String s2)
	{
		//listnen
		//silent
		if(s1.length() != s2.length())
			return false;
		
		char[] p1=s1.toCharArray();
		char[] p2=s2.toCharArray();
		
		Arrays.sort(p1);
        Arrays.sort(p2);
        
       return Arrays.equals(p1, p2);
        
 	}
	
	public static void chekMultipleAnagram(String[] strArr)
	{
	   Map<String,List<String>> map = new HashMap<>();	
		for(String str:strArr)
		{
			char[] c= str.toCharArray();
			
			Arrays.sort(c);
			String newdata=new String(c);
			
			map.computeIfAbsent(newdata, k -> new ArrayList<>()).add(str);
		}
		
		//print the vaue 
		
		for(List<String> group:   map.values())
		{
			System.out.println(group);
 
		}
		
		
		
		
	}


	
}
