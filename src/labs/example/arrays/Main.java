/* 
@author: Cannon Bennett
@Date: 3/2/2026
@purpose: 

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/arrays/*.java
Java -cp bin labs/example/arrays/Main
*/

package labs.example.arrays;

public class Main {
    public static void main(String[] args) {

        ArrayOperations arrayOperations = new ArrayOperations();

        arrayOperations.createNewArray(5);
    }
}