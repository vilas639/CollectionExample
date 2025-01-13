package com.ashokit.senariobased.collection;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionExample {

    public static void main(String[] args) {

     /*
      How would you create an immutable list?
Answer:
Use Collections.unmodifiableList or List.of (Java 9+):
      */
        List<String> immutableList = List.of("A", "B", "C");

       // immutableList.add("D");
        System.out.println(immutableList.toString());



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
