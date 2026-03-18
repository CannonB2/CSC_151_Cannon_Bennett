/* 
@author: Cannon Bennett
@Date: 3/18/2026
@purpose: 

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/int_arrays/*.java
Java -cp bin labs/example/int_arrays/Main
*/

package labs.example.int_arrays;

public class IntegerArrays {
    
    public void checkArrays(int[] firstArray, int[] secondArray) {
        String checkLength = "No";
        String checkValues = "No";
        int firstLength = 0;
        int secondLength = 0;
        int sameValues = 0;


        for (int num = 0; num <= firstArray.length-1; num++) {
            firstLength++;
        }

        for (int num = 0; num <= secondArray.length-1; num++) {
            secondLength++;
        }
        
        if (firstLength == secondLength) {
            checkLength = "Yes";
        } 
        
        for (int num1 = 0; num1 <= firstArray.length-1; num1++) {
            for (int num2 = 0; num2 <= secondArray.length-1; num2++) {
                if (firstArray[num1] == secondArray[num2]) {
                    sameValues++;
                }
            }
        }

        if (firstLength > secondLength) {
            if (sameValues == firstLength) {
                checkValues = "Yes";
            }
        } else {
            if (sameValues == secondLength) {
                checkValues = "Yes";
            }
        }


        if (checkLength == "Yes") {
            System.out.println(checkLength + " these arrays are the same length.");
        } else {
            System.out.println(checkLength + " these arrays are not the same length.");
        }

        if (checkValues == "Yes") {
            System.out.println(checkValues + " these arrays contain the same values.");
        } else {
            System.out.println(checkValues + " these arrays do notcontain the same values.");
        }
    }
}