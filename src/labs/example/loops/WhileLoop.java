/* 
@author: Cannon Bennett
@Date: 2/23/2026
@purpose: experimenting with while loops

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/loops/*.java
Java -cp bin labs/example/loops/WhileLoop
*/

package labs.example.loops;

// creates WhileLoop class
public class WhileLoop {

    // Creates a method that is used to run a while loop. The loop runs until the count variable is greater than 10 and then prints the end result of count.
    private static void executeWhileLoop() {
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println(count);
        }
        System.out.println("Loop complete. Loop ran " + count + " times.");
    }

    // Creates the main method to be used here since the other method in here is private, and thus cannot be called outside of the file it was made in.
    public static void main(String[] args) {

        // Creates a new WhileLoop instance
        WhileLoop whileLoop = new WhileLoop();
        
        // Calls the other method
        WhileLoop.executeWhileLoop();
    }
}