/* 
@author: Cannon Bennett
@Date: 2/4/2026
@purpose: Used to run the mammal file
*/

package labs.example.mammal;

public class Main {
    public static void main(String[] args) throws Exception {
        Mammal mammal = new Mammal();

        mammal.name = "Dog";

        // mammal.getMammalDetails();

        mammal.sit();
        if (mammal.name == "Dog") {
            System.out.println("The " + mammal.breed + " is " + mammal.stand() + " and " + mammal.bark() + ".");
        } else {
            System.out.println("The " + mammal.breed + " is " + mammal.stand() + ".");
        }

        // mammal.walk();

        
    }
}