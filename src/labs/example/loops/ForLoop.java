/* 
@author: Cannon Bennett
@Date: 2/23/2026
@purpose: 

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/loops/*.java
Java -cp bin labs/example/loops/ForLoop
*/

package labs.example.loops;

public class ForLoop {

    public static void main(String[] args) {

        ForLoop forLoop = new ForLoop();
        
        forLoop.executeForLoop();
    }

    private void executeForLoop() {
        int iterations = 0;
        for (int count = 1; count <= 20; count++) {
            System.out.println(count);
            iterations++;
            
        }
        System.out.println("Loop complete. Loop ran " + iterations + " times.");
    }
}