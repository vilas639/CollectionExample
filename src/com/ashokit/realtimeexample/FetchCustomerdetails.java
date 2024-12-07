package com.ashokit.realtimeexample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FetchCustomerdetails {
    public static void main(String[] args) {
        String filePath = "/Users/vilasjadhav/Desktop/MacBookAir/Java/newmicroservices/CollectionExample/src/com/ashokit/realtimeexample/cards.csv";
        List<Customer10> customerList = new ArrayList<>();

        // Reading the file using absolute file path
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("~");
                if (parts.length == 8) {
                    Customer10 customer = new Customer10(
                            parts[0], parts[1], parts[2], parts[3],
                            parts[4], parts[5], parts[6], parts[7]);
                    customerList.add(customer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the list of customers
        System.out.println("Customers:");
        customerList.forEach(System.out::println);


        // 1. List of unique customers based on customerId
        List<Customer10> uniqueCustomers = customerList.stream()
                .collect(Collectors.toMap(Customer10::getCustomerId, customer -> customer, (existing, replacement) -> existing))
                .values()
                .stream()
                .collect(Collectors.toList());

        System.out.println("Unique Customers:");
        uniqueCustomers.forEach(System.out::println);

        // 2. Location-wise customers
        Map<String, List<Customer10>> locationWiseCustomers = customerList.stream()
                .collect(Collectors.groupingBy(Customer10::getCity));

        System.out.println("\nLocation-wise Customers:");
        locationWiseCustomers.forEach((city, customers) -> {
            System.out.println("City: " + city);
            customers.forEach(System.out::println);
        });
    }




}
