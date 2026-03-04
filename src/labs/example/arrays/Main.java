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

        int[] numberList = {11, 5, 92, 30, 70, 77, 63, 60, 83, 89, 95, 48, 78, 55, 28, 92, 80, 32, 53, 47,
                            46, 10, 27, 24, 25, 88, 6, 73, 62, 36, 3, 76, 93, 71, 25, 31, 94, 38, 45, 26,
                            113, 192, 75, 58, 138, 148, 4, 165, 161, 159};
        arrayOperations.sortArray(numberList);
    }
}