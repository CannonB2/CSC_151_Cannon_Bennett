/* 
@author: Cannon Bennett
@Date: 3/23/2026
@purpose: 
*/

package labs.example.fileOperations;

import java.io.*; //using the java.io library because its not a pain -crystal talbert
import java.util.*;

// record Account(String name, double grade) {};

public class FileOperator { 

    //creating file paths 
    private static final String BASE_FILE_PATH = "T:\\CSC_151_Cannon_Bennett\\src\\labs\\example\\fileOperations\\"; //base path to package 
    //not sure of this filepath format, worst case look up windows filepathing in java
    private static final String USERS_CSV_FILE = "src\\labs\\example\\fileOperations\\files\\users.csv";//points to users.csv
    private static final String CSV_LOGS_FILE = "src\\labs\\example\\fileOperations\\logs\\csv_error.log";

    public static void fileOperations() {

        File students_file = new File(BASE_FILE_PATH + USERS_CSV_FILE);
        File log_file = new File(BASE_FILE_PATH + CSV_LOGS_FILE);


        if (students_file.exists() && log_file.exists()) {

        } else {

            if (!log_file.exists()) {

            }
        }

        if (!students_file.exists()) {
            System.out.println("Error! Could not find users file.")
        }
        if (!log_file.exists()) {
            System.out.println("Error! Could not find csv error log.")
        }

        /*
        private static void openCsvFile(File csvFile, BufferedReader br) //pass in file and bufferedreader objects 
        {
            try
            {
                String line; //variable to read each line in the file 

                if(csvFile.exists())//checks to see if the file exists before looping 
                {
                    while ((line = br.readLine()) != null) //runs until end of file. Checks to see if the line variable is set to null. 
                    {
                    //to split up a line in a csv file 
                    //String[] value = line.split(","); 
                    }
                }
            }
            catch(IOException e) //generic exception 
            {   
                System.out.println("Error opening file");
            }
        }
        */
    }
}