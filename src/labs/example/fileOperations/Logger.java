/* 
@author: Cannon Bennett
@Date: 3/23/2026
@purpose: More practice is reading and writing to files

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/fileOperations/*.java
Java -cp bin labs/example/fileOperations/Logger
*/

package labs.example.fileOperations;

import java.io.*;
import java.util.*;

// Creates Logger class
public class Logger {

    // Used to declare the file paths from the start
    private static final String BASE_FILE_PATH = "T:\\CSC_151_Cannon_Bennett\\src\\labs\\example\\fileOperations";
    private static final String API_LOGS_FILE = BASE_FILE_PATH + "\\logs\\api_error.log";

    // Main method used to run other methods in the class
    public static void main(String[] args) {
        try {

            // Creates a new instance of the logger class
            // creates the first buffer reader to be used
            Logger logger = new Logger();
            BufferedReader log;

            // makes the buffer reader we just created contain the information from the api error log
            // runs a method to get the amount of errors in the log, passing the buffer reader to the method, then closes the file
            log = logger.openErrorLog();
            logger.getCountOfErrorTypes(log);
            log.close();

            // creates a second buffer reader that also contains information from the error log
            // runs a method to count the amount of times the memory is exceeded in the log, passing the buffer reader to the method, then closes the file
            BufferedReader log2;
            log2 = logger.openErrorLog();
            logger.getMemoryLimitExceededCount(log2);
            logger.getDiskSpaceErrorsWithIPAddress(log2);
            log2.close();
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
    }

    // method used to get the information from the api error log for a buffer reader object
    private BufferedReader openErrorLog() {
        // creates a buffer reader that we can return
        BufferedReader br = null;

        try {
            // sets br to contain the api error log
            br = new BufferedReader(new FileReader(API_LOGS_FILE));
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
        // returns the api error log
        return br;
    }

    // creates a method that counts the different types of errors and prints them
    private void getCountOfErrorTypes(BufferedReader file) {
        try {
            
            // variables used to count the amount of errors that occur and contain the current line
            int warn = 0;
            int error = 0;
            int info = 0;
            int debug = 0;
            String line;

            // while loop used to go through the error log, stopping once it reaches the end or "null"
            while ((line = file.readLine()) != null) {
                // splits the current line up into an array using regex to find where to split
                String[] value = line.split("\\[|\\]");

                // checks what kind of error the current line contains and increases the corresponding variable
                if (value[1].equals("WARN")) {
                    warn++;
                } else if (value[1].equals("ERROR")) {
                    error++;
                } else if (value[1].equals("INFO")) {
                    info++;
                } else if (value[1].equals("DEBUG")) {
                    debug++;
                }
            }

            // prints the number of each error
            System.out.println("These are the number of different error types:");
            System.out.println("Warn: " + warn + "\n Error: " + error + "\n Info: " + info + "\n Debug: " + debug);
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
    }

    // counts of the amount of times the memory limit is exceeded and where they occur
    private void getMemoryLimitExceededCount(BufferedReader file) {
        try {
            // variables used to count the amount of times memory is exceeded, store the current line, and an array list to contain the different endpoints
            int memError = 0;
            String line;
            var endpointList = new ArrayList<String>();

            // loops over each line until reaching the end
            while ((line = file.readLine()) != null) {
                // uses regex again to slit the line up and then check if the memory limit was exceeded on that line
                String[] value = line.split("\\- |\\|");
                if (value[1].equals("Memory limit exceeded in worker thread ")) {
                    // if it was, increases the variable for tracking the amount of times it happens and adds the endpoint of the line to the array list
                    memError++;
                    endpointList.add(value[2]);
                }
            }

            // prints the amount of times the memory limit was exceeded and then loops over the endpoints array list to print the endpoints
            System.out.println("The amount of times the memory limit was exceeded is: " + memError);
            System.out.println("Endpoints these occur on: ");

            for (String endpoint : endpointList) {
                System.out.println(endpoint);
            }
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
    }

    private void getDiskSpaceErrorsWithIPAddress(BufferedReader file) {
        try {
            int lineNum = 0;
            String line;
            var lineNumList = new ArrayList<int> ();
            var ipList = new ArrayList<String> ();

            while ((line = file.readline()) != null) {
                lineNum++;
                String[] value = line.split("\\]|\\- |\\|");
                if (value[2].equals("Disk space running low ")) {
                    lineNumList.add(lineNum);
                    ipList.add(value[1]);
                }
            }

            for (int i = 0; i <= lineNumList.size(); i++) {
                System.out.println("Disk Space error on line " + lineNumList[i] + " for IP Address: " + ipList[i]);
            }
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
    }
}
// Disk space running low 