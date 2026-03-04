/* 
@author: Cannon Bennett
@Date: 3/2/2026
@purpose: 
*/

package labs.example.arrays;

public class ArrayOperations {

    public void createNewArray(int num) {
        int[] numbers = new int[num];

        for (int count = 1; count <= numbers.length; count++) {
            numbers[count-1] = count;
        }

        displayArray(numbers);
    }

    private void displayArray(int[] values) {
        System.out.println("I created a new array and it now has " + values.length + " items in it");
        System.out.println("The array items and their values are listed below:");

        for (int count = 0; count <= values.length-1; count++) {
            System.out.println(values[count]);
        }
    }
    
    public void sortArray(int[] numbers) {
        int[] numbersSorted = new int[50];
        int lastHighest = 200;
        int lastLowest = 0;

        for (int count = 0; count <= numbers.length-1; count++) {
            int highNum = 0;
            int lowNum = 200;

            for (int index = 0; index <= numbers.length-1; index++) {

                if ((numbers[index] > highNum) && (highNum < lastHighest)) {
                    highNum = numbers[index];
                    System.out.println("high: " + highNum);
                }
                if ((numbers[index] < lowNum) && (lowNum > lastLowest)) {
                    lowNum = numbers[index];
                    System.out.println("low: " + lowNum);
                }
            }
            
            numbersSorted[count] = lowNum;
            numbersSorted[numbersSorted.length-count-1] = highNum;

            if (highNum < lastHighest) {
                    lastHighest = highNum;
                    System.out.println("highest: " + lastHighest);
            }
            if (lowNum > lastLowest) {
                lastLowest = lowNum;
                System.out.println("lowest: " + lastLowest);
            }
        }

        for (int count = 0; count <= numbersSorted.length-1; count++) {
            System.out.println(numbersSorted[count]);
        }
    }
    
}