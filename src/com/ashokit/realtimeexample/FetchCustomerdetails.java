package com.ashokit.realtimeexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FetchCustomerdetails {
    public static void main(String[] args) {
        String filePath = "/cards.csv"; // File in the resources folder
        List<Customer10> customerList = new ArrayList<>();

        // Reading the file from resources
        try (InputStream is = FetchCustomerdetails.class.getResourceAsStream(filePath);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

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

        // Output the customers
        customerList.forEach(System.out::println);
    }
}
