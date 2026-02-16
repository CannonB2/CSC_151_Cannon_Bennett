/* 
@author: Cannon Bennett
@Date: 2/9/2026
@purpose: Main file used to call methods from Physics file

Comments for compiling and running so I don't forget/can just copy and paste it
Javac -d bin src/labs/example/physics/*.java
Java -cp bin labs/example/physics/Main
*/

// I'm not explaining this again. Tt's in the last one, go look there.
package labs.example.physics;

// Creates Main class for use in running physics operations from the Physics class
public class Main {
    public static void main(String[] args) {

        // Creates a new instance of Physics to use
        Physics physics = new Physics();

        // Sets up variables to be used later
        // variables are set to be equal to the returned variable from their respective methods
        double angle = physics.calcAngle(3, 4);
        double distanceEarthToSun = physics.getDistance(physics.getLightSpeedInMPH(), physics.getTimeFromSunToEarthInHours());

        /* 
        Uses the different get methods from Physics for calculations and then prints the returned result to console with the proper units
        values inside parenthesis are passed to the method for use in calculations 
        (If the calculations don't make sense in a realistic setting that's because I used a random number generator, plus I am not a math nerd so I don't know what the results should look like)
        */

        System.out.println(physics.getDistance(12.57, 4.19) + " miles");

        System.out.println(physics.getVelocity(4.75, 15.84) + " mph");

        System.out.println(physics.getMomentum(10.98, 3.79) + " kg m/s");

        System.out.println(physics.getForce(13.9, 14.12) + " kg m/s^2");

        System.out.println(physics.getWork(12.98, 10.98) + " Joules");

        System.out.println(physics.getKineticEnergy(14.72, 6.62) + " Joule");

        System.out.println(physics.getPotentialEnergy(9.18, 5.52) + " Joule");

        // Runs an if-else statement to check if the returned angle is from a right triangle, running two different methods depending on the result
        if (angle > 37 || angle < 36.87) 
        {
            physics.logInvalidAngleInfo(angle);
        } 
        else 
        {
            physics.logValidAngleInfo(angle);
        }

        // runs an if statement to check if the returned distance is the actual distance from the sun to the earth
        // if the result is wrong then a method is ran. If it's not... I don't know what should happen you didn't tell us
        if (distanceEarthToSun != 92947266.72)
        {
            physics.logEarthToSunInvalidDistance(distanceEarthToSun);
        }
    }
}