/* 
@author: Cannon Bennett
@Date: 2/23/2026
@purpose: 

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/loops/*.java
Java -cp bin labs/example/loops/WhileLoop
*/

package labs.example.loops;

public class WhileLoop {

    private static void executeWhileLoop() {
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println(count);
        }
        System.out.println("Loop complete. Loop ran " + count + " times.");
    }
    public static void main(String[] args) {

        WhileLoop whileLoop = new WhileLoop();
        
        WhileLoop.executeWhileLoop();
    }
}