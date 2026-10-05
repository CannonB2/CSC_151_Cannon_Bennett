/*
Name: Kallie Bennett
Date: 9/23/2026
Description: Program meant to practice how Hashmaps and files work
*/

package com.labs;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // creates a new instance of the Book object to be used to store information in before adding it to a hashmap
        // creates a hashmap to store book information in
        Book bookInfo = new Book();
        HashMap<Integer, Book> salesMap = new HashMap<>();
        SalesOperations salesOperations = new SalesOperations();
        // sends the book object and hashmap to a method that will fill the hashmap with information from a file
        salesOperations.readWriteFile(bookInfo, salesMap);

        // runs a loop over the hashmap and prints each stored entry
        for (Integer id : salesMap.keySet()) {
                System.out.println("ID: " + id + "      Title: " + salesMap.get(id).title + "    Total Quantity Sold: " + salesMap.get(id).totalQuantitySold + "    Total Revenue: " + salesMap.get(id).totalRevenue);
        }
    }
}