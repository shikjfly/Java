package cc.openhome.vetual;

import java.io.PrintStream;

public final class Ball{
    
    public static final PrintStream out = null;
    double radius = 10;    
    
    public static final double PI = 3.14159265358979323846;
    
    public static double toRadians(double angdeg) {
        return angdeg * (Ball.PI / 180);
    }
    
}