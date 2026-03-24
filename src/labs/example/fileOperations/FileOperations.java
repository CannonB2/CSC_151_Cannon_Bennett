/* 
@author: Cannon Bennett
@Date: 3/2/2026
@purpose: 

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/fileOperations/*.java
Java -cp bin labs/example/fileOperations/FileOperations
*/

package labs.example.fileOperations;

//import com.fasterxml.jackson.databind.MappingIterator;
//import com.fasterxml.jackson.dataformat.csv.CsvMapper;
//import com.fasterxml.jackson.dataformat.csv.CsvSchema;
//import java.io.IOException;
//import java.nio.file.Path;
//import java.util.List;

import java.io.*; //using the java.io library because its not a pain -crystal talbert

public class FileOperations { 
    //creating file paths 
    private static final String BASE_FILE_PATH = "C:/Users/Malak/CSC_151_Cannon_Bennett//src/labs/example/fileOperations/"; //base path to package 
    //not sure of this filepath format, worst case look up windows filepathing in java
    private static final String USERS_CSV_FILE = "files/users.csv";//points to users.csv


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


}