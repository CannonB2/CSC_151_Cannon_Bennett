/* 
@author: Cannon Bennett
@Date: 3/23/2026
@purpose: used to run functions from the FileOperator.java file

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/fileOperations/*.java
Java -cp bin labs/example/fileOperations/Main
*/

package labs.example.fileOperations;


public class Main {
    public static void main(String[] args) {

        FileOperator fileOperator = new FileOperator();

        fileOperator.fileOperations();


    }
}