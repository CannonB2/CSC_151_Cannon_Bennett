/* 
@author: Cannon Bennett
@Date: 3/2/2026
@purpose: Program for testing different array operations
*/

package labs.example.arrays;

// Create ArrayOperations class
public class ArrayOperations {

    // Creates a method for creating an array that accepts an int parameter
    public void createNewArray(int num) {
        // Uses the parameter that was passed through to create an array, with the length being set to the number that was passed through
        int[] numbers = new int[num];

        // runs a for loop based on the length of the array, inserting the current loop variable into the array for each iteration
        for (int count = 1; count <= numbers.length; count++) {
            numbers[count-1] = count;
        }

        // Calls a method to display the number array, passing the array through as a parameter
        displayArray(numbers);
    }

    // Creates a method to display array information from an array that was passed through as a parameter
    private void displayArray(int[] values) {
        System.out.println("I created a new array and it now has " + values.length + " items in it");
        System.out.println("The array items and their values are listed below:");

        // Runs a for loop to print each value in the array
        for (int count = 0; count <= values.length-1; count++) {
            System.out.println(values[count]);
        }
    }
    
    // Creates a method used to sort an array that is passed through as a parameter
    public void sortArray(int[] numbers) {

        // Creates array and variables to be used later on
        int[] numbersSorted = new int[numbers.length];
        // variables will be used to store the highest and lowest numbers found in the previous iteration
        int lastHighest = 200;
        int lastLowest = 0;

        // Runs a for loop over the numbers array. Due to how the program sorts numbers from the array, it only needs to run for half the length of the array.
        for (int count = 0; count <= numbers.length/2-1; count++) {
            // Creates two more variables to store the current highest and lowest numbers found
            int highNum = 0;
            int lowNum = 200;

            // Runs another for loop, this time across the entire numbers table
            for (int index = 0; index <= numbers.length-1; index++) {

                /*
                If the number at the current index is greater than the current highest number and is less than the highest number from the last iteration, 
                set the current highest number equal to the indexed number 
                */
                if ((numbers[index] > highNum) && (numbers[index] < lastHighest)) {
                    highNum = numbers[index];

                }

                /*
                If the number at the current index is less than the current lowest number and is greater than the lowest number from the last iteration, 
                set the current lowest number equal to the indexed number 
                */
                if ((numbers[index] < lowNum) && (numbers[index] > lastLowest)) {
                    lowNum = numbers[index];
                }
            }
            
            // inserts the current lowest number into the sorted array at an index based on the loop variable
            numbersSorted[count] = lowNum;
            // inserts the current highest number into the sorted array at an index based on the length of the sorted array minus the loop variable
            numbersSorted[numbersSorted.length-count-1] = highNum;

            // if the current highest number is less than the last highest, set the last highest equal to the current highest
            if (highNum < lastHighest) {
                lastHighest = highNum;
            }

            // if the current lowest number is greater than the last lowest, set the last lowest equal to the current lowest
            if (lowNum > lastLowest) {
                lastLowest = lowNum;
            }
            /*
            highNum and lowNum are used to make sure that the next numbers that are selected can not be ones that were selected previously, 
            since the method has already sorted numbers that are either that low or that high
            */
        }

        // Uses a for loop to print the numbers stored in the now sorted array
        System.out.println("Array has been sorted. Sorted array:");
        for (int count = 0; count <= numbersSorted.length-1; count++) {
            System.out.println(numbersSorted[count]);
        }
    }
    
    // Create a method used to display the days and months in a year
    public void getDaysAndMonths() {

        // Creates two arrays, one to store the number of days in each month, and the other to store the months in the year
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        // Runs a for loop that prints the months and their respective days in order based on the current number stored in the loop variable
        for (int index = 0; index <= 11; index++) {
            System.out.println("There are " + days[index] + " days in " + months[index]);
        }
    }
}  