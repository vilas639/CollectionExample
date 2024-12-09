package com.ashokit.realtimeexample;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FetchCustomerdetails1 {

    public static void main(String[] args) {

        //read file from resource
        String filename="/Users/vilasjadhav/Desktop/MacBookAir/Java/newmicroservices/CollectionExample/src/com/ashokit/realtimeexample/cards.csv";

        List<Customer10> customerlist = new ArrayList<Customer10>();
//new FileInputStream(filename):  Opens the file at the path specified by filename for reading.
//new InputStreamReader  :  convert raw byte into characters
// BufferedReader   :  Reads text from an input stream efficiently
//        Open the file for reading using a BufferedReader.
//        Skip the first line (header).
//                Read each line, one by one.
//        Split the line into parts using the ~ delimiter.
//                Check if the line contains exactly 8 parts (valid data).
//                Create a Customer10 object using these parts.
//        Add the object to the customerlist.
//        Repeat the process until all lines are processed.
        try(BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(filename))))
        {
            String line;
            br.readLine();
            while((line= br.readLine()) !=null)
            {
                //split
                String[] parts=line.split("~");
                if(parts.length==8)
                {
                    //take a data
                    //split into ~
                    //add object into list
                    Customer10 c= new Customer10(
                            parts[0], parts[1], parts[2], parts[3],
                            parts[4], parts[5], parts[6], parts[7]
                    );

                    customerlist.add(c);
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        //display

        //customerlist.forEach(System.out::println);


        //find unique customer


       List<Customer10> customerunique= customerlist.stream()
                .collect(Collectors.toMap(Customer10::getCustomerId,Customer10->Customer10,(e,n)->e))
                .values()
                .stream()
                .collect(Collectors.toList());

          //process the list list element by element
          //Converts the stream into a Map.
           //Uses the getCustomerId method as the key for the map.
           // Specifies that the value in the map should be the Customer10 object itself
           //Resolves conflicts when duplicate customerIds are found. The existing value (e) is retained, and the new value (n) is ignored.
          //Extracts all the unique values (Customer10 objects) from the map.
          // Creates a new stream from the unique Customer10 objects.
          //Collects the stream back into a List.

        System.out.println("Unique Customers");
       customerunique.forEach(System.out::println);

        //location wise display customer
      Map<String, List<Customer10>> localtionwiselist=  customerlist.stream()
                .collect(Collectors.groupingBy(Customer10::getCity));

      localtionwiselist.forEach((city,customer) ->
      {
          System.out.println("city"+city);
          customer.forEach(System.out::println);
      });

      //Creates a stream from the customerlist.
        //Groups the customers by their city (getCity).
       // The key (String) is the city.
       // The value (List<Customer10>) is a list of customers belonging to that city.
        //test1

    }
}
