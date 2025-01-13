package com.ashokit.senariobased.collection;
package com.example.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionExample {

    public static void main(String[] args) {

     /*
      How would you create an immutable list?
Answer:
Use Collections.unmodifiableList or List.of (Java 9+):
      */
    
      //  List<String> immutableList = List.of("A", "B", "C");

       // immutableList.add("D");
        //System.out.println(immutableList.toString());



       /* 2. How do you synchronize a collection?
        Answer:
        Use Collections.synchronizedList or CopyOnWriteArrayList for thread safety:
   */
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        synchronizedList.add("1");
        synchronizedList.add("5");
        synchronizedList.add("9");

        System.out.println(synchronizedList.toString());


//        3. How would you remove duplicates from a list?
//        Answer:
//        Convert the list to a Set to remove duplicates:

        List<Integer> list = Arrays.asList(1, 2, 2, 3,6,4,35,5);
        //Set<Integer> uniqueSet = new HashSet<>(list);  //1, 2, 3, 35, 4, 5, 6    order not maintain
      //  Set<Integer> uniqueSet = new LinkedHashSet<>(list);  //1, 2, 3, 6, 4, 35, 5  order is maintain
        Set<Integer> uniqueSet = new TreeSet<>(list); //1, 2, 3, 4, 5, 6, 35  orcer in sorted order
        System.out.println(uniqueSet.toString());


//        . How would you find the most frequent element in a list?
//                Answer:
//                Use a Map to count occurrences:

        List<String> list1 = Arrays.asList("A", "B", "A", "C", "A");
        Map<String, Long> frequencyMap = list1.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println(frequencyMap.toString());

       Map<String,Long>  duplicate=frequencyMap.entrySet().stream()
                .filter(t -> t.getValue() > 1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                        ));
        //String mostFrequent = Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(duplicate.toString());


        ////Given a String, find the  repeated character in it using Stream functions?
        String input6 = "vilas savaji jadhav";
        Map<Character ,Long> numcount= input6.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))
                 .collect(Collectors.groupingBy(e -> e , Collectors.counting()));


        System.out.println(numcount.toString());
        Map<Character ,Long> numcount1=    numcount.entrySet().stream()
                .filter(t -> t.getValue()>1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
        System.out.println(numcount1.toString());


//        5. How would you sort a list of custom objects?
//                Answer:
//                Implement Comparator or use a lambda:

        List<Person> people = Arrays.asList(new Person("Alice", 25), new Person("Bob", 20));

        people.stream()
                .sorted(Comparator.comparing(Person::getAge))
        .forEach(p -> System.out.println (p));

        
        //merge 2 maps
        //Map<String, Integer> map1 = Map.of("a", 1, "b", 2);
        //Map<String, Integer> map2 = Map.of("b", 3, "c", 4);
        
        Map<String,Integer> map1= new HashMap<>();
        map1.put("a",1);
        map1.put("b",2);
        
        Map<String,Integer> map2= new HashMap<>();
        map2.put("b",3);
        map2.put("c",4);

        Map<String, Integer> mergedMap = Stream.of(map1, map2)
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (value1, value2) -> value1 + value2 // merge values
                ));

        System.out.println(mergedMap); // {a=1, b=5, c=4}



        
        CopyOnWriteArrayList<String> list2 = new CopyOnWriteArrayList<>(Arrays.asList("A", "B", "C"));
        for (String s : list2) {
            list2.add("D");
        }
        
        System.out.println(list2.toString());
        
//        9. How would you find the first non-repeated character in a string using collections?
//        		Answer:
//        		Use a LinkedHashMap:

        		
        		String str = "swiss";
        		Map<Character, Long> map = str.chars().mapToObj(s -> (char) s)
        				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        		
        		char firstNonRepeated = map.entrySet().stream().
        				filter(e -> e.getValue() == 1)
        				.map(Map.Entry::getKey)
        				.findFirst()
        				.orElse(null);

        		System.out.println(firstNonRepeated);
        		
        		
        		
        		
//        		11. How would you find duplicates in a list?
//        				Answer:
//        				Use a Set to track seen elements:

        		        List<Integer> list4 = new ArrayList<>();
        		        list4.add(4);
        		        list4.add(2);
        		        list4.add(5);
        		        list4.add(7);
        		        list4.add(2);
        		       
        			
        				Set<Integer> duplicates = list4.stream().
        						distinct()
        						.collect(Collectors.toSet());
        				
        				System.out.println(duplicates.toString());
        				
        				
//        				How would you reverse a list?
//        						Answer:
//        						Use Collections.reverse:

        						List<Integer> list6 = Arrays.asList(1, 2, 3);
        						Collections.reverse(list6);

                				System.out.println(list6.toString());

//                				
//                				13. How would you sort a map by its values?
//                						Answer:
//                						Use a Comparator:

                						Map<String, Integer> map3 = new HashMap<>();
                						map3.put("A",5);
                						map3.put("V",2);
                						map3.put("C",1);
                						map3.put("P",9);
                						
                						map3.entrySet().stream()
                						   .sorted(Map.Entry.comparingByValue())  // c,v,a,p
                						   .forEachOrdered(System.out::println);
  
//                						15. How would you handle concurrent modifications during iteration?
//                								Answer:
//                								Use ConcurrentHashMap:

                								ConcurrentHashMap<String, String> map4 = new ConcurrentHashMap<>();
                								map4.put("A", "1");

                								for (String key : map4.keySet()) {
                								    map4.put("B", "2");
                								}
                								
                								System.out.println(map4.toString());
                					
//                								17. How would you remove all elements from a collection that match a condition?
//                										Answer:
//                										Use removeIf:
                								 List<Integer> list5 = new ArrayList<>();
                			        		        list5.add(4);
                			        		        list5.add(2);
                			        		        list5.add(5);
                			        		        list5.add(17);
                			        		        list5.add(2);
                			        		       
                										list5.removeIf(n -> n < 10);	 //17
                										System.out.println(list5.toString());
                										
                										
//                										18. How would you merge two lists without duplicates?
//                												Answer:
//                												Use a Set:
                										List<String> list7 = Arrays.asList("a", "b", "c");
                										List<String> list8 = Arrays.asList("b", "c", "d");

                										List<String> mergedList = Stream.concat(list7.stream(), list8.stream())
                										        .distinct()
                										        .collect(Collectors.toList());

                										System.out.println(mergedList); // [a, b, c, d]
                										
                										PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
                										pq.add(10);
                										pq.add(5);
                										pq.add(12);
                										pq.add(3);
                										System.out.println(pq.poll());//12   //remove the elemet
                										System.out.println(pq); //10 ,5, 3
    
    }
}

class Person {

    private  String Name;
    private  int age;

    Person(String name,int age)
    {
        this.Name=name;
        this.age=age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
