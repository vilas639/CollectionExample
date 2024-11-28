package com.ashokit.collectionall.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
		
		hashmap.put("ram", 1);
		hashmap.put("shyam",500);
		hashmap.put("ganesh",700);
		hashmap.put("rajesj",200);
		hashmap.put("ramm",150);
		hashmap.put("ranni",100);
		
		System.out.println(hashmap);
		hashmap.put("ranni",900);

		System.out.println(hashmap);
		
		//get value
		      System.out.println(hashmap.get("ram"));
		      
		      //get all key
		        Set s=hashmap.keySet();
		        System.out.println("key set"+s);
		        
		        //get all value
		        Collection<Integer> s1= hashmap.values();
		        System.out.println("key set"+s1);
		        
		        
		        //retrive key and value
		        
		         Set s3=hashmap.entrySet();
		         System.out.println("entry set"+s3);
		         
		         //retrive the key and value
		         
		        Iterator<Entry<String,Integer>> s4= s3.iterator();
		        
		        while(s4.hasNext())
		        {
		        	Entry<String,Integer> e=(Entry) s4.next();
		        	
		        	System.out.println("key "+e.getKey()+" value "+e.getValue());
		        	
		        	if(e.getKey().equals("ranni"))
		        	{
		        		e.setValue(1000);
		        	}
		        }
		         
		        System.out.println("final"+hashmap);
		         
		         
		         
		         
		         //employee add in hashmap retrive the data in descending order
		        
		   LinkedHashMap<String, Integer> m1=     hashmap.entrySet().stream()
		        .sorted((t1,t2) -> t2.getKey().compareTo(t2.getKey()))
		        .collect(Collectors.toMap(
		        		Entry :: getKey,
		        		Entry :: getValue,
		        		(e1,e2) -> e1,
		        		LinkedHashMap::new));
		   
		   
		   m1.forEach((k,v) -> System.out.println(k+""+v));
		   
		 //employee add in hashmap retrive the data in descending order
	        
		   LinkedHashMap<String, Integer> m2=     hashmap.entrySet().stream()
		        .sorted((t1,t2) -> t2.getValue().compareTo(t1.getValue()))
		        .collect(Collectors.toMap(
		        		Entry :: getKey,
		        		Entry :: getValue,
		        		(e1,e2) -> e1,
		        		LinkedHashMap::new));
		   
		   
		   m2.forEach((k,v) -> System.out.println(k+" | "+v));
		        
		        
		      
	}

}
