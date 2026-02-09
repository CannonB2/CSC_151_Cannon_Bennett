/* 
@author: Cannon Bennett
@Date: 2/9/2026
@purpose: Main file used to call methods from Physics file
*/

// Javac -d bin src/labs/example/physics/*.java
// Java -cp bin labs/example/physics/Main

package labs.example.physics;

public class Main {
    public static void main(String[] args) {
        Physics physics = new Physics();

        System.out.println(physics.getDistance(5, 6) + " miles.");

        System.out.println(physics.getVelocity(14, 2) + " mph.");

        System.out.println(physics.getMomentum(10, 3) + " kg m/s.");

        System.out.println(physics.getForce(8, 4) + " kg m/s^2");
    }
}