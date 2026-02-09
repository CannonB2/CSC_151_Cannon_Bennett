/* 
@author: Cannon Bennett
@Date: 2/9/2026
@purpose: file used to hold methods for use in physics calculations
*/

package labs.example.physics;
import java.lang.Math;

public class Physics {

    int x;
    int v;
    int p;
    int w;
    int f;
    int ke;
    int pe;

    final static double GRAVITY = 9.81;

    public double getDistance(int v, int t) {
        x = v * t;
        return x;
    }

    public double getVelocity(int x, int t) {
        v = x / t;
        return v;
    }

    public double getMomentum(int m, int v) {
        p = m * v;
        return p;
    }

    public double getForce(int m, int a) {
        f = m * a;
        return f;
    }
}