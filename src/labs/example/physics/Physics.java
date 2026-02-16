/* 
@author: Cannon Bennett
@Date: 2/9/2026
@purpose: file used to hold methods for use in physics calculations
*/

// Directory path so this thing actually compiles
package labs.example.physics;
// Math library for math purposes
import java.lang.Math;

// Creates physics class with physic operations (a.k.a. I don't know what to comment so I'm putting random stuff here)
public class Physics {

    // g r a v i t y (Constant because gravity typically doesn't change)
    final static double GRAVITY = 9.81;


    // Creates methods for each physics operation. Each method takes an imputed value from Main, calculates it, and then returns the result
    // The variables that are created inside each method were originally created outside of them alongside GRAVITY, but I felt like it looked cleaner this way. It might be as smart though I'm really not sure.
    public double getDistance(double v, double t) {
        double x;
        x = v * t;
        return x;
    }

    public double getVelocity(double x, double t) {
        double v;
        v = x / t;
        return v;
    }

    public double getMomentum(double m, double v) {
        double p;
        p = m * v;
        return p;
    }

    public double getForce(double m, double a) {
        double f;
        f = m * a;
        return f;
    }

    public double getWork(double f, double d) {
        double w;
        w = f * d;
        return w;
    }

    public double getKineticEnergy(double m, double v) {
        double ke;
        // Used pow from math instead of multiplying v by itself to square it because I'm cool (I'm not)
        ke = 0.5 * m * Math.pow(v, 2);
        return ke;
    }

    public double getPotentialEnergy(double m, double h) {
        double pe;
        pe = m * GRAVITY * h;
        return pe;
    }

    // calculate the angle in degrees of a triangle
    public double calcAngle(double a, double b) {
        double angle = Math.atan2(a, b) * 180/3.1415;
        return angle;
    }

    // prints a message if the previously calculated angle was not from a right triangle
    public void logInvalidAngleInfo(double angle) {
        System.out.println("logging the angle " + angle + " degrees. This is not a right angle.");
    }

    // prints a message if the previously calculated angle was from a right triangle
    public void logValidAngleInfo(double angle) {
        System.out.println("logging the angle " + angle + " degrees. This is a valid 3-4-5 triangle.");
    }

    // calculates the speed of light in miles per hour
    // This should probably just be a constant since light speed doesn't tend to change
    public int getLightSpeedInMPH() {
        int lSpeed = 186282;
        return lSpeed * 3600;
    }

    // calculates the time it takes for light to get from the earth to the sun in hours
    public double getTimeFromSunToEarthInHours() {
        return 92947266.72 / 670615200;
    }

    // if the the distance from the earth to the sun was calculated incorrectly then this will print
    public void logEarthToSunInvalidDistance(double distance) {
        System.out.println("logging the distance " + distance + " miles. This is not the right distance.");
    }
}