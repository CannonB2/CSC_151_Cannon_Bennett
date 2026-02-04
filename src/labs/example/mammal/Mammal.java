/* 
@author: Cannon Bennett
@Date: 1/28/2026
@purpose: Creates a Mammal class with appropriate properties and methods
*/

package labs.example.mammal;
import java.lang.Math;

public class Mammal {
    
    String hairColor = "brown";
    String eyeColor = "brown";
    int bodyTemp = 101;
    String breed = "labradoodle";
    int height = 21;
    int weight = 50;

    public void run() {

    }

    public void eat() {

    }

    public void sleep() {

    }

    public void scratch() {

    }

    public void play() {

    }

    public void drink() {

    }

    public void walk() throws Exception {
        int southDistance = 3;
        int eastDistance = 4;
        double a = Math.pow(southDistance, 2);
        double b = Math.pow(eastDistance, 2);
        double c = Math.sqrt(a + b);
        double angle = Math.toDegrees(Math.atan2(3, 4));

        System.out.println("The " + this.breed + " is walking " + southDistance + " miles South.");
        Thread.sleep(southDistance*1000);
        System.out.println("The " + this.breed + " is now walking " + eastDistance + " miles East.");
        Thread.sleep(eastDistance*1000);
        System.out.println("The distance that the" + this.breed + " walked from start point to end point is " + c + ".");
        System.out.println("The angle at the longest leg of the walk is " + angle + " degrees.");
    }

    public void fetch() {

    }

    public void sit() throws Exception {
        int sitTime = 15000;
        System.out.println("The " + this.breed + " is sitting, they will stand up in " + sitTime/1000 + " seconds.");
        Thread.sleep(sitTime);
        System.out.println("The " + this.breed + " is " + stand() + " and " + bark() + ".");
    }

    public void getMammalDetails() {
        System.out.println(this.hairColor);
        System.out.println(this.eyeColor);
        System.out.println(this.bodyTemp);
        System.out.println(this.breed);
        System.out.println(this.height);
        System.out.println(this.weight);
    }

    public String stand() {
        return "standing";
    }

    public String bark() {
        return "barking";
    }
}