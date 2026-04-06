/* 
@author: Cannon Bennett
@Date: 3/23/2026
@purpose: Used to practice file operations with java
*/

package labs.example.fileOperations;

import java.io.*; //using the java.io library because its not a pain -crystal talbert
import java.util.*;


public class FileOperator { 

    //creating file paths 
    private static final String BASE_FILE_PATH = "T:\\CSC_151_Cannon_Bennett\\src\\labs\\example\\fileOperations"; //base path to package 
    //not sure of this filepath format, worst case look up windows filepathing in java
    private static final String USERS_CSV_FILE = BASE_FILE_PATH + "\\files\\users.csv";//points to users.csv
    private static final String CSV_LOGS_FILE = BASE_FILE_PATH + "\\logs\\csv_error.log";
    private static final String API_LOGS_FILE = BASE_FILE_PATH + "\\logs\\api_error.log";

    // creates fileOperations method that will be used for creating and writing to files for now
    public static void fileOperations() {

        // creates two file objects to read and write to
        File studentsFile = new File(USERS_CSV_FILE);
        File csvLogFile = new File(CSV_LOGS_FILE);

        // I'm honestly not great at understanding when to use try and catch but it threw a fit without them so here they are
        try {
            // creates a buffered writer with a file writer inside it for use in writing to the csv_error log file
            BufferedWriter csvFileWriter = new BufferedWriter(new FileWriter(CSV_LOGS_FILE, true));

            // checks to see if the users file and csv error file exists before executing
            if (studentsFile.exists() && csvLogFile.exists()) {

                // creates another buffered reader used to read information from the users file
                // creates variables to be used throughout the upcoming while loop
                BufferedReader br = new BufferedReader(new FileReader(USERS_CSV_FILE));
                String line;
                int count = 0;
                int grade = 0;
                int avg = 0;
                
                // runs a while loop until the end of the file is reached
                while ((line = br.readLine()) != null) {
                    // if statement used to run everything except the first line because we don't need it
                    if (count > 0) {
                        // splits the current line into multiple values to be stored in an array
                        String[] value = line.split(",");

                        // gets the length of the previously created array
                        int gradesTotal = value.length - 1;

                        // turns the stored values into integers and adds them together, then finds the average, and finally prints the average
                        grade = Integer.parseInt(value[1]) + Integer.parseInt(value[2]) + Integer.parseInt(value[3]);
                        avg = grade/gradesTotal;
                        System.out.println(value[0] + "'s average is " + avg);
                    }

                    // increments the count so we can actually use the if statement after the first iteration
                    count++;
                }

            // if the files do not exist
            } else {

                // creates a string to store an error message
                String errorMessage;

                // if the csv error file does not exist
                if (!csvLogFile.exists()) {
                    // sets the error message to reflect that the file is missing and adds it to the newly created file
                    errorMessage = "ERROR: MISSING CSV FILE! Creating CSV file.";
                    csvFileWriter.write(errorMessage);
                    csvFileWriter.newLine();
                }
                // once finished, closes the file
                csvFileWriter.close();
            }

        }
        catch(IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
    }

    public static void readAPILog() {
        try {
            File apiLogFile = new File(API_LOGS_FILE);

            if (apiLogFile.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(API_LOGS_FILE));
                String line;

                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } 
        catch(IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        } 
    }
}