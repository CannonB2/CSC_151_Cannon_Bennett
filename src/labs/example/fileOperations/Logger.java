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

public class Logger {

    private static final String BASE_FILE_PATH = "T:\\CSC_151_Cannon_Bennett\\src\\labs\\example\\fileOperations";
    private static final String API_LOGS_FILE = BASE_FILE_PATH + "\\logs\\api_error.log";

    public static void main(String[] args) {
        try {
            Logger logger = new Logger();
            BufferedReader log;
            log = logger.openErrorLog();
            logger.getCountOfErrorTypes(log);
            log.close();
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
    }

    private BufferedReader openErrorLog() {
        BufferedReader br = null;

        try {
            File apiLogFile = new File(API_LOGS_FILE);
            br = new BufferedReader(new FileReader(API_LOGS_FILE));
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
        return br;
    }

    private void getCountOfErrorTypes(BufferedReader file) {
        try {
            int warn = 0;
            int error = 0;
            int info = 0;
            int debug = 0;
            String line;

            while ((line = file.readLine()) != null) {
                String[] value = line.split("\\[|\\]");
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

            System.out.println("These are the number of different error types:");
            System.out.println("Warn: " + warn + "\n Error: " + error + "\n Info: " + info + "\n Debug: " + debug);
        }
        catch (IOException e) {
            System.out.println("Error! could not get Buffer Reader object.");
        }
    }
}