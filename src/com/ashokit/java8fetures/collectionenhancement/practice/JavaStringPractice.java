package com.ashokit.java8fetures.collectionenhancement.practice;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class JavaStringPractice {
	  public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        //count the number of word
	        //count the occurance
	        String name="VILAS SAVAJI JADHAV VILAS";

	        Map<Object,Long> headcount= Arrays.stream(name.trim().split(" "))
	        .collect(Collectors.groupingBy(e->e, Collectors.counting()));

	        headcount.forEach((ele,count) -> System.out.println("elem"+ele+""+count));

	        //find the duplicate with there count
	        Map<Object,Long> nuofduplicate=headcount.entrySet().stream()
	        .filter(entry -> entry.getValue() > 1)
	        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

	        System.out.println(nuofduplicate);

	        //find the repeated charater
	        Map<Character,Long> repeated=name.replaceAll(" ", "")
	        .toLowerCase()
	        .chars()
	        .mapToObj(c -> (char)c)
	        .collect(Collectors.groupingBy(c-> c,Collectors.counting()))
	        .entrySet().stream()
	        .filter( m -> m.getValue() >1)
	        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

	        System.out.println("repeated char "+repeated);

	        //find the first repeated charater
	        Optional<Map.Entry<Character,Long>> repeated1=name.replaceAll(" ", "")
	        .toLowerCase()
	        .chars()
	        .mapToObj(c -> (char)c)
	        .collect(Collectors.groupingBy(c-> c,Collectors.counting()))
	        .entrySet().stream()
	        .filter( m -> m.getValue() >1)
	        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
	        .entrySet().stream()
	        .findFirst();

	        System.out.println("repeated"+repeated1);

	        //find the first nonrepeated charater
	        Optional<Map.Entry<Character,Long>>  nonrepeated=name.replaceAll(" ", "")
	        .toLowerCase()
	        .chars()
	        .mapToObj(c -> (char)c)
	        .collect(Collectors.groupingBy(c-> c,Collectors.counting()))
	        .entrySet().stream()
	        .filter( m -> m.getValue() == 1)
	        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
	        .entrySet().stream()
	        .findFirst();

	        System.out.println("nonrepeated"+nonrepeated);

	        //find the most repeated charater
	        Optional<Object> repeated10=name.replaceAll(" ", "")
	        .toLowerCase()
	        .chars()
	        .mapToObj(c -> (char)c)
	        .collect(Collectors.groupingBy(c-> c,Collectors.counting()))
	        .entrySet().stream()
	        .filter( m -> m.getValue() >1)
	        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
	        .entrySet().stream()
	        .max(Map.Entry.comparingByValue())
	        .map(Map.Entry::getKey);

	        System.out.println("most repeated"+repeated10);


	        //reverse the character of each word
	        String reversename=Arrays.stream(name.split(" "))
	        .map(w -> new StringBuilder(w).reverse().toString())
	        .collect(Collectors.joining(" "));

	        System.out.println("reverse name"+reversename);

	        //reverse string
	        //String input = "HelloWorld";

	        String reversed = name.
	                chars()                     // IntStream of characters
	                .mapToObj(c -> (char) c)    // convert int to char
	                .collect(Collectors.collectingAndThen(
	                        Collectors.toList(),
	                        list -> {
	                            Collections.reverse(list); // reverse the list
	                            return list.stream()
	                                    .map(String::valueOf)
	                                    .collect(Collectors.joining());
	                        }));

	        System.out.println(reversed); // dlroWolleH
	  }
}
