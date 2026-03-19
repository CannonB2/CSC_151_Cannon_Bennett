/* 
@author: Cannon Bennett
@Date: 3/18/2026
@purpose: used to run procedures from the IntergerArrays.java file

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/int_arrays/*.java
Java -cp bin labs/example/int_arrays/Main
*/

package labs.example.int_arrays;

// creates the main class and then method used to run methods from IntegerArrays
public class Main {
    public static void main(String[] args) {

        // creates a new IntegerArrays instance
        IntegerArrays integerArrays = new IntegerArrays();

        // creates two arrays that are passed to a method to check if they are the same length and contain the same values
        int[] firstArray = {1, 5, 7, 2, 4, 3, 9, 8};
        int[] secondArray = {2, 9, 9, 3, 5, 7, 1, 2};
        integerArrays.checkArrays(firstArray, secondArray);

        // creates three arrays containing 25 values each and passes them to a method that is used to find the total of each and which one is highest
        int[] arr1 = {93, 29, 72, 20, 61, 67, 4, 47, 7, 42, 43, 79, 23, 5, 71, 18, 59, 91, 34, 2, 27, 90, 45, 37, 52};
        int[] arr2 = {57, 62, 83, 53, 76, 6, 39, 17, 43, 90, 34, 91, 99, 96, 42, 37, 35, 86, 49, 92, 40, 4, 100, 27, 93};
        int[] arr3 = {27, 100, 20, 93, 14, 28, 31, 17, 35, 33, 29, 96, 68, 51, 30, 82, 32, 69, 66, 70, 64, 74, 25, 47, 59};
        integerArrays.sumArrays(arr1, arr2, arr3);

        // creates another array, this time containing 50 values that are then passed to a method that finds the highest one
        int[] myArray = {212, 89, 82, 50, 7, 37, 99, 80, 154, 138, 234, 127, 143, 247, 57, 177, 53, 118, 164, 70, 39, 120, 239, 172, 189, 15, 200, 
                        100, 129, 197, 188, 146, 158, 230, 33, 185, 167, 25, 111, 77, 244, 122, 193, 41, 35, 56, 210, 85, 175, 74};
        integerArrays.highestNumArray(myArray);

        // creates one final array that is used to simulate the digits from a credit card and then passes the array to a method that performs a mod 10 check on the test card
        // I would have simulated the card as one long value but I didn't know how to go over each number individually like that
        int[] cardNum = {4, 2, 4, 2, 4, 2, 4, 2, 4, 2, 4, 2, 4, 2, 4, 2};
        integerArrays.modTenCheck(cardNum);
    }
}