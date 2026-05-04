package com.ashokit.collectionall.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

        //chekMultipleAnagram(strArr);
        
        
       // System.out.println(MostFrequentChar("SUCESS"));
        
        //Find the Maximum Occurring Word in a Given Sentence

      //  System.out.println(maxWord("java java python java python p p p p p p p")); // Output: java

      //  Check if a String Contains Only Digits
        
       // System.out.println(containsOnlyDigits("123456")); // true
     //   System.out.println(containsOnlyDigits("123a56")); // false

  //remove junk charactor
      //  System.out.println(RemoveSpecialChars("J@@v@@a!2345")); 
        
        //reverse the number 
      //  System.out.println(ReverseInteger(12345846)); 
        
        //number is palindrome or not
      // palindromeNumber(121); 
        
        
        //Largest & Smallest Numbers in an Array
        int[] nums2 = {1, 2, 3, 5, 6, 7,100, 8,9,99, 10};
        findlargestandsmallest(nums2);
        
        findsecondlargestandsmallest(nums2);
        
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
	
	public static char MostFrequentChar(String s)
	{   int[] temchar = new int[256];
		int maxcount=-1;
		char maxchar = 0;
		
		for(char c: s.toCharArray())
		{
			temchar[c]++;
			  if (temchar[c]>maxcount)
		    {
		    	maxcount =temchar[c];
		    	maxchar=c;
		    }
		    
		    
		   
		}
		
		return maxchar;
	}

	
	private static String maxWord(String string) {
		// TODO Auto-generated method stub
		String[] words=string.split(" ");
		HashMap<String,Integer> maxword= new  HashMap<>();
		int maxcount=0;
		String maxdata="";
		for(String s:words)
		{
			maxword.put(s, maxword.getOrDefault(s, 0)+1);
			
			if(maxword.get(s)>maxcount)
			{
				maxcount =maxword.get(s);
				maxdata =s;
			}
		}
		System.out.println(maxword);
		
		return maxdata;
	}
	
	  public static boolean containsOnlyDigits(String str) {
	        for (char c : str.toCharArray()) {
	            if (c < '0' || c > '9') return false;
	        }
	        
//	        Comparator.comparing(null);
//	        Comparator.nullsFirst
//	        comparator.nulssLast()
	     
	        return true;
	    }

	  public static String RemoveSpecialChars(String str)
	  {
		  str = str.replaceAll("[^a-zA-Z-0-9]", "");
		  return str;
	  }
	  
	
	  
	   public static Integer ReverseInteger(Integer num)
	   {
		   Integer reverse=0;
		   
		   while(num!=0)
		   {
			   reverse=reverse * 10 +num%10;
			   num /=10;
		   }
		   
		   return reverse;
	   }
	   
	   public static void palindromeNumber(Integer num)
	   {
		   Integer reverse=0;
		   Integer originnumber=num;
		   
		   while(num!=0)
		   {
			   reverse=reverse * 10 +num%10;
			   num /=10;
		   }
		   
		   if(reverse==originnumber)
		   {
			   System.out.println("yes its palindrome "+reverse);
		   }
		   else
		   {
			   System.out.println("No its palindrome ");
		   }
	   }
	   
	   public static void findlargestandsmallest(int[] num)
	   {
		   int largest=num[0];
		   int smallest = num[0];
		   
		   for(int n:num)
		   {
			   if(n>largest)
			   {
				   largest=n;
			   }
			   if(n<smallest)
			   {
				   smallest=n;
			   }
		   }
		   
		   System.out.println("largest is "+largest);
		   System.out.println("smallest is "+smallest);
	   }
	   
	   public static void findsecondlargestandsmallest(int[] num)
	   {
		   int largest=Integer.MIN_VALUE;
		   int smallest = Integer.MAX_VALUE;
		   
		   int secondlarget=Integer.MIN_VALUE;
		   int secondsmallest = Integer.MAX_VALUE;
		   for(int n:num)
		   {
			   if(n>largest)
			   {
				   secondlarget=largest;
				   largest=n;
			   }
			   else if(n > secondlarget)
			   {
				   secondlarget=n;
			   }
			   
			   if(n<smallest)
			   {
				   secondsmallest=smallest;
				   smallest=n;
			   }
			   else if(n<secondsmallest)
			   {
				   secondsmallest=n;
			   }
		   }
		   
		   System.out.println("largest is "+secondlarget);
		   System.out.println("smallest is "+secondsmallest);
	   }



	
}
