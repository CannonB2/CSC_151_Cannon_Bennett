/* 
@author: Cannon Bennett
@Date: 3/23/2026
@purpose: More practice is reading and writing to files

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/fileOperations/*.java
Java -cp bin labs/example/fileOperations/Logger
*/

package labs.example.fileOperations;

public class Logger {

    private static final String BASE_FILE_PATH = "T:\\CSC_151_Cannon_Bennett\\src\\labs\\example\\fileOperations";
    private static final String API_LOGS_FILE = BASE_FILE_PATH + "\\logs\\api_error.log";

    public static void main(String[] args) {
        Logger logger = new Logger();
        BufferedReader log;
        log = logger.openErrorLog();
    }

    private BufferedReader openErrorLog() {
        File apiLogFile = new File(API_LOGS_FILE);

        BufferedReader br = new BufferedReader(new FileReader(API_LOGS_FILE));
        return br;
    }
}