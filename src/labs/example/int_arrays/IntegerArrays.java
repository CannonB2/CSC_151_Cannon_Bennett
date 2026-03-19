/* 
@author: Cannon Bennett
@Date: 3/18/2026
@purpose: testing and learning more about how arrays work with integers

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/int_arrays/*.java
Java -cp bin labs/example/int_arrays/Main
*/

package labs.example.int_arrays;

// creates IntergerArrays class that can be called from the Main.java file
public class IntegerArrays {
    
    // creates a method that takes two integer arrays and checks if they have the same total value and length
    public void checkArrays(int[] firstArray, int[] secondArray) {

        // these two string variables are created to tell whether or not the value and length are the same
        String checkLength = "No";
        String checkValues = "No";

        // integer variables used to store the length of each array and the number of same values
        int firstLength = 0;
        int secondLength = 0;
        int sameValues = 0;

        // for loops used to get the length of each array by incrementing each variable per iteration
        for (int num = 0; num <= firstArray.length-1; num++) {
            firstLength++;
        }

        for (int num = 0; num <= secondArray.length-1; num++) {
            secondLength++;
        }
        
        // if the lengths are equal then changes the value in checkLength to reflect that
        if (firstLength == secondLength) {
            checkLength = "Yes";
        } 
        
        // runs a for loop over one array, then used a nested for loop to go over the other
        // if the value from the first array at the current iteration is the same as one of the values in the other array, then the program increments the nunber of same values
        for (int num1 = 0; num1 <= firstArray.length-1; num1++) {
            for (int num2 = 0; num2 <= secondArray.length-1; num2++) {
                if (firstArray[num1] == secondArray[num2]) {
                    sameValues++;
                }
            }
        }

        // Checks to see which array is longer
        // This is done because the if statement immediately after needs to compare the number of same values to the length
        // If the number of same values is equal to the length of the longer array then that means the lists contain the same values, changing checkValues to reflect that
        if (firstLength > secondLength) {
            if (sameValues == firstLength) {
                checkValues = "Yes";
            }
        } else {
            if (sameValues == secondLength) {
                checkValues = "Yes";
            }
        }


        // uses if-else statements to check whether the length and values are the same, printing appropriate messages based the results
        if (checkLength == "Yes") {
            System.out.println(checkLength + " these arrays are the same length.");
        } else {
            System.out.println(checkLength + " these arrays are not the same length.");
        }

        if (checkValues == "Yes") {
            System.out.println(checkValues + " these arrays contain the same values.");
        } else {
            System.out.println(checkValues + " these arrays do not contain the same values.");
        }
    }

    // creates a method used to find the sum of three arrays and then prints the one with the highest total
    public void sumArrays(int[] arr1, int[] arr2, int[] arr3) {

        // variables created to store each sum
        int arr1Sum = 0;
        int arr2Sum = 0;
        int arr3Sum = 0;

        // for loops used to run over each array, adding the number at the current index to the total
        for(int num = 0; num <= arr1.length-1; num++) {
            arr1Sum += arr1[num];
        }

        for(int num = 0; num <= arr2.length-1; num++) {
            arr2Sum += arr2[num];
        }

        for(int num = 0; num <= arr3.length-1; num++) {
            arr3Sum += arr3[num];
        }

        // prints the sum of each array neatly
        System.out.println("First Array Sum: " + arr1Sum + "\n Second Array Sum: " + arr2Sum + "\n Third Array Sum: " + arr3Sum);

        // uses if-else statements to check which array has the highest value and prints a message based on which one it was
        if ((arr1Sum > arr2Sum) && (arr1Sum > arr3Sum)) {
            System.out.println("The first array has the highest total.");
        } else if ((arr2Sum > arr1Sum) && (arr2Sum > arr3Sum)) {
            System.out.println("The second array has the highest total.");
        } else if ((arr3Sum > arr1Sum) && (arr3Sum > arr2Sum)) {
            System.out.println("The third array has the highest total.");
        }
    }

    // method used to find the highest number in an array
    public void highestNumArray(int[] myArray) {

        // stores the last highest number found
        int highestNum = 0;

        // runs a loop over the array and uses a nested if statement to check if the number at the current index is higher than the highest number so far, changing the highest number if it is
        for(int num = 0; num <= myArray.length-1; num++) {
            if (highestNum < myArray[num]) {
                highestNum = myArray[num];
            }
        }

        // prints the highest number found
        System.out.println("The highest value in the myArray object is: " + highestNum);
    }

    // method used to run a mod 10 check to validate a credit card number
    public void modTenCheck(int[] cardNum) {

        // integer variables used to store the sum and the numbers that will be added
        int sum = 0;
        int currentNum = 0;

        // this variable is just here so I can add the numbers from the array to a string to print it neatly
        String cardNumString = "";

        // runs a for loop over an array containing each digit from a test card
        for (int num = 1; num <= cardNum.length; num++) {

            // sets the current number equal to the value at the current index
            currentNum = cardNum[num-1];

            // if the current interation variable is an odd number then multiplies the current number by 2
            // then if the current number is greater than 9, subracts 9 from it
            if ((num % 2) != 0) {
                currentNum *= 2;

                if (currentNum > 9) {
                    currentNum -= 9;
                }
            }

            // adds the current number to sum and the value at the current index to the card number string
            sum += currentNum;
            cardNumString += cardNum[num-1];
        }

        // prints a message to display whether the card is valid or not
        // If the sum is divisible by 10 then the card is valid, otherwise it is not
        if ((sum % 10) == 0) {
            System.out.println("The Credit Card Number " + cardNumString + " is valid.");
        } else if ((sum % 10) != 0) {
            System.out.println("The Credit Card Number " + cardNumString + " is  not valid.");
        }
    }
}