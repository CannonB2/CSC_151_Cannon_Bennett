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

        
    }
}