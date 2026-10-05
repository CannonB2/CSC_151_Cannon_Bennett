package com.labs;
import java.util.*;
import java.io.*;


public class SalesOperations {
    // declares a base file path to use throughout the program
    private static final String BASE_FILE_PATH = "C:\\\\Users\\\\Malak\\\\CSC_151_Cannon_Bennett\\\\week7\\\\src\\\\main\\\\java\\\\com\\\\labs";

    // creates a method that will be used to read data from a file, store the data in an object, then store that object in a hashmap
    public static void readWriteFile(Book book, HashMap<Integer, Book> map) {
        try {
            // creates a buffered reader to read file info from and a buffered writer to write to a file in case errors occur
            BufferedReader salesReader = new BufferedReader(new FileReader(BASE_FILE_PATH + "\\sales.csv"));
            BufferedWriter exceptionWriter = new BufferedWriter(new FileWriter(BASE_FILE_PATH + "\\exceptions.csv"));

            // variables used to store the current line number, the data on that line, and for whether an error has been encountered
            Integer count = 1;
            String line;
            Boolean fileException = false;

            // runs a loop over the sales file until there are no lines left
            while ((line = salesReader.readLine()) != null) {

                // splits the current line whenever a comma occurs
                String[] splitLine = line.split(",");

                // runs an if else statement to check if the line has more than 4 values. If it does not then that line is invalid and message is written to the error file
                if (splitLine.length != 4) {
                    exceptionWriter.write("ERROR: Invalid line or Line does not contain enough data at line " + count);
                    exceptionWriter.newLine();
                } else {

                    // runs a loop over the file to check if there are empty entry, changing file exception to true if there are
                    for (String item : splitLine) {
                        if (item == "") {
                            fileException = true;
                        }
                    }


                    /*  runs an if else loop, adding the book to the map if this is the first time it has appeared, updating the total quantity and revenue if it is already stored, 
                    or adding an error message to the error file if invalid data was on that line */
                    if (fileException != true && !(map.containsKey(Integer.parseInt(splitLine[0])))) {
                        book.bookID = Integer.parseInt(splitLine[0]);
                        book.title = splitLine[1];
                        book.totalQuantitySold = Integer.parseInt(splitLine[2]);
                        book.price = Double.parseDouble(splitLine[3]);
                        book.totalRevenue = book.price * book.totalQuantitySold;
                        map.put(book.bookID, book);
                        book = new Book();
                    } else if (fileException != true && map.containsKey(Integer.parseInt(splitLine[0]))) {
                        map.get(Integer.parseInt(splitLine[0])).totalQuantitySold += Integer.parseInt(splitLine[2]);
                        map.get(Integer.parseInt(splitLine[0])).totalRevenue = map.get(Integer.parseInt(splitLine[0])).totalQuantitySold * map.get(Integer.parseInt(splitLine[0])).price;
                    } else {
                        exceptionWriter.write("ERROR: Missing information at line " + count);
                        exceptionWriter.newLine();
                    }
                }

                // increases the current count to that error messages can be properly stored
                count++;
            }

            // closes both files used
            salesReader.close();
            exceptionWriter.close();
        } catch (IOException e) {
            System.out.println("Error while handling Buffered Reader object.");
        }
    }
}
