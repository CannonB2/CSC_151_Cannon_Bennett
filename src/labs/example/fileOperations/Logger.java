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
    private static final String BASE_FILE_PATH = "C:\\Users\\Malak\\CSC_151_Cannon_Bennett\\src\\labs\\example\\fileOperations";
    private static final String API_LOGS_FILE = BASE_FILE_PATH + "\\logs\\api_error.log";
    private static final String HTTP_LOGS_FILE = BASE_FILE_PATH + "\\logs\\http_access.log";

    // Main method used to run other methods in the class
    public static void main(String[] args) {
        try {

            // Creates a new instance of the logger class
            // creates the first buffer reader to be used
            Logger logger = new Logger();
            BufferedReader log;

            // makes the buffer reader we just created contain the information from the api error log
            // runs a method to get the amount of errors in the log, passing the buffer reader to the method, then closes the file
            /*      From previous assignment
            log = logger.openErrorLog();
            logger.getCountOfErrorTypes(log);
            log.close();
            */

            // creates a second buffer reader that also contains information from the error log
            // runs a method to count the amount of times the memory is exceeded in the log, passing the buffer reader to the method, then closes the file
            BufferedReader log2;
            log2 = logger.openErrorLog(API_LOGS_FILE);
            /*      From previous assignment
            logger.getMemoryLimitExceededCount(log2);
            */
            logger.getDiskSpaceErrorsWithIPAddress(log2);
            log2.close();

            // Creates another buffer reader to be used throughout
            // I think I'm suppose to only open the log once, but the way I read the file makes it so that doesn't work
            BufferedReader log3;
            log3 = logger.openErrorLog(HTTP_LOGS_FILE);
            logger.getGMTOffset(log3);
            log3 = logger.openErrorLog(HTTP_LOGS_FILE);
            logger.getHTTPCodes(log3);
            log3 = logger.openErrorLog(HTTP_LOGS_FILE);
            logger.getResponseSizes(log3);
            log3 = logger.openErrorLog(HTTP_LOGS_FILE);
            logger.groupHTTPMethodsAndEndPoints(log3);
            log3.close();
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
    }

    // method used to get the information from the api error log for a buffer reader object
    private BufferedReader openErrorLog(String file) {
        // creates a buffer reader that we can return
        BufferedReader br = null;

        try {
            // sets br to contain the api error log
            br = new BufferedReader(new FileReader(file));
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

    // method used to get each disk space error, printing the line it occurs on and the ip address
    private void getDiskSpaceErrorsWithIPAddress(BufferedReader file) {
        try {
            // variables used to store the current line number and line
            // array lists used to store each line number that an error occurs on and the ip of that error
            int lineNum = 0;
            String line;
            var lineNumList = new ArrayList<String> ();
            var ipList = new ArrayList<String> ();

            // loops over each line in the file
            while ((line = file.readLine()) != null) {
                // increases the line number for each iteration and splits the line to make it easier to find if there was a disk space error
                lineNum++;
                String[] value = line.split("\\]|\\- |\\|");

                // if a disk space error was found adds the current line number and the ip to their respective lists
                if (value[2].equals("Disk space running low ")) {
                    lineNumList.add(String.valueOf(lineNum));
                    ipList.add(value[1]);
                }
            }

            // loops over one of the lists based on the lists size, printing the values found in both lists based on the iteration variable
            for (int i = 0; i <= lineNumList.size()-1; i++) {
                System.out.println("Disk Space error on line " + lineNumList.get(i) + " for IP Address: " + ipList.get(i));
            }
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
    }

    // method used to count every distinct offset in a file
    private void getGMTOffset(BufferedReader file) {
        try {
            // lists used to store each distinct offset and the amount of times they occur
            var offsetList = new ArrayList<String> ();
            var numOffsetsList = new ArrayList<String> ();
            String line;

            // reads through the file
            while ((line = file.readLine()) != null) {
                // creates a variable for the offset counter
                // splits the current line to help find the offset
                int offsetCount = 1;
                String[] value = line.split("\\ |\\]");
                
                // This part might be weird but I tried my best
                /* 
                this is set up so that "i" loops through all potential values that an offset could be. Then an if statement is used to check if
                "i" is equal to the offset at the current iteration. If it is, runs another if-else statement to check if the offset is already stored
                in its list. If the offset is found in its list then a for loop is run over the list to find where the offset is placed and increases the offset counter
                at that index in the numOffsetsList. If the value was never found in the first place, adds the offset to the offsets list and the offset counter to the 
                number of offsets list.
                Hopefully that made sense
                */
                for (int i = -1000; i <= 1000; i++) {
                    if (Integer.parseInt(value[4]) == i) {
                        if (offsetList.contains(value[4])) {
                            for (int index = 0; index <= offsetList.size()-1; index++) {
                                if (offsetList.get(index).equals(value[4])) {
                                    offsetCount += Integer.parseInt(numOffsetsList.get(index));
                                    numOffsetsList.set(index, String.valueOf(offsetCount));
                                }
                            }
                        } else {
                            offsetList.add(value[4]);
                            numOffsetsList.add(String.valueOf(offsetCount));
                        }
                    }
                }
            }

            // runs a loop over the offset list, printing the distinct offsets and the number off times they occur based on their index
            System.out.println("Distinct offsets and how much they occur:");
            for (int i = 0; i <= offsetList.size()-1; i++) {
                System.out.println("Offset: " + offsetList.get(i) + " Occurences: " + numOffsetsList.get(i));
            }
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
    }

    // method used to get the amount of times different errors occur
    private void getHTTPCodes(BufferedReader file) {
        try {
            // variables used to store each error based on their number
            String line;
            int fiveXXErrors = 0;
            int threeXXErrors = 0;
            int twoXXErrors = 0;
            
            // loops through the log file
            while ((line = file.readLine()) != null) {
                // splits the line to help find the error numbers in probably the least efficient way possible
                String[] value = line.split("\\ ");

                // checks if the error number at the current index is a 2xx, 3xx, or 5xx error by checking what numbers they are between
                if ((Integer.parseInt(value[8]) >= 200) && (Integer.parseInt(value[8]) < 299)) {
                    twoXXErrors++;
                } else if ((Integer.parseInt(value[8]) >= 300) && (Integer.parseInt(value[8]) < 399)) {
                    threeXXErrors++;
                } else if ((Integer.parseInt(value[8]) >= 500) && (Integer.parseInt(value[8]) < 599)) {
                    fiveXXErrors++;
                }
            }

            // prints each error type
            System.out.println("5xx Errors: " + fiveXXErrors);
            System.out.println("3xx Errors: " + threeXXErrors);
            System.out.println("2xx Errors: " + twoXXErrors);
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
    }

    // gets the number of responses that are past a certain number
    private void getResponseSizes(BufferedReader file) {
        try {
            // variable used to store the amount of times the response has exceeded 3900
            String line;
            int highResponseCount = 0;

            // runs through the file, splits each line, then checks if the response time is past 3900, increasing the count variable if it is
            while ((line = file.readLine()) != null) {
                String[] value = line.split("\\ ");
                if (Integer.parseInt(value[9]) > 3900) {
                    highResponseCount++;
                }
            }

            // prints the count variable
            System.out.println("Number of Responses Past 3900: " + highResponseCount);
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
    }

    // method used to find different http verbs, only storing them if they are not already stored
    private void groupHTTPMethodsAndEndPoints(BufferedReader file) {
        try {
            // variables used to store the current line and unique http verbs
            String line;
            var verbList = new ArrayList<String> ();

            // runs through the file, splits each line, then checks the value stored in the first spot
            // if the value is not contained in the verb list, adds it to the list
            while ((line = file.readLine()) != null) {
                String[] value = line.split("\\\"|\\ /");
                if (!(verbList.contains(value[1]))) {
                    verbList.add(value[1]);
                }
            }

            // as the print statement below says, this loop prints each verb once
            System.out.println("Printing each verb used once:");
            for (String verb: verbList) {
                System.out.println(verb);
            }
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
    }
}