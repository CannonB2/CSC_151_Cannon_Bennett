/* 
@author: Cannon Bennett
@Date: 2/23/2026
@purpose: experimenting with for loops

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/loops/*.java
Java -cp bin labs/example/loops/ForLoop
*/

package labs.example.loops;

// creates ForLoop class
public class ForLoop {

    // Main method is created here instead of in a seperate file since most methods here are private
    public static void main(String[] args) {

        // Creates a new instance of ForLoop
        ForLoop forLoop = new ForLoop();
        
        // I don't know this ones just chilling
        forLoop.executeForLoop();

        // Passes through two values to be summed together. The returned sum is assigned to sumNumbers, decremented, then printed to console.
        int sumNumbers = forLoop.sumTwoNumbers(5, 2);
        sumNumbers--;
        System.out.println("The sum of 5 and 2 decremented by 1 is " + sumNumbers);

        // Passes through a value that is used to decide how many times to run the loop. The returned sum is assigned to sumLoop and printed out.
        int sumLoop = forLoop.sumLoopCounter(7);
        System.out.println("The sum after the loop is complete is " + sumLoop);

        // Passes a number through to be used for multiplication
        forLoop.printMultiplicationTable(7);
    }

    // Creates a method that runs a for loop. The loop runs 20 times and then prints a statement to confirm it is done.
    private void executeForLoop() {
        int iterations = 0;
        for (int count = 1; count <= 20; count++) {
            System.out.println(count);
            iterations++;
            
        }
        System.out.println("Loop complete. Loop ran " + iterations + " times.");
    }

    // Adds two numbers. That's it.
    private int sumTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Creates a method that takes a parameter and uses it to run a for loop. The loop increases the sum variable by 1 each time it runs and upon completion returns the sum.
    private int sumLoopCounter(int num) {
        int sum = 0;
        for (int count = 1; count <= num; count++) {
            sum++;
            System.out.println(sum);
        }

        return sum;
    }

    // Creates a method that takes a parameter to be used in a for loop. Each time the loop runs it multiplies the parameter by the current loop variables value and prints the result.
    private void printMultiplicationTable(int num) {
        for (int count = 0; count <= 12; count++) {
            System.out.println("The product of " + num + " multiplied by " + count + " is " + count*num);
        }
    }
}