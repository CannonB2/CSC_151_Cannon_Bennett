/* 
@author: Cannon Bennett
@Date: 3/18/2026
@purpose: 

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/int_arrays/*.java
Java -cp bin labs/example/int_arrays/Main
*/

package labs.example.int_arrays;

public class Main {
    public static void main(String[] args) {

        IntegerArrays integerArrays = new IntegerArrays();

        int[] firstArray = {1, 5, 7, 2, 4, 3, 9, 8};
        int[] secondArray = {2, 9, 9, 3, 5, 7, 1, 2};
        integerArrays.checkArrays(firstArray, secondArray);
    }
}