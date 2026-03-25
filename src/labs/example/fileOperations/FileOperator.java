/* 
@author: Cannon Bennett
@Date: 3/23/2026
@purpose: 
*/

package labs.example.fileOperations;

import java.io.*; //using the java.io library because its not a pain -crystal talbert

// record Account(String name, double grade) {};

public class FileOperator { 
    public static void fileOperator (String[] args) {
        //creating file paths 
        // private static final String BASE_FILE_PATH = "T:/CSC_151_Cannon_Bennett/src/labs/example/fileOperations/files/users.csv"; //base path to package 
        //not sure of this filepath format, worst case look up windows filepathing in java
        // private static final String USERS_CSV_FILE = "files/users.csv";//points to users.csv
        Path filePath = Path.of(System.getProperty("CSC_151_Cannon_Bennett.home"), "files", "users.csv");
/*
        //this is your base that you will use for most file operations 
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