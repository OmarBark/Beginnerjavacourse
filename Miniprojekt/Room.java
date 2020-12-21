package Miniprojekt;

import java.awt.Dimension;



public class Room {
    static double roomHeightEnd = 100;
    static double roomWidthEnd = 100;
    double roomHeightStart = -100;
    double roomWidthStart = -100;
    Room(){
 
         StdDraw.setXscale(-100.0, 100.0);
            StdDraw.setYscale(-100.0, 100.0);
            StdDraw.enableDoubleBuffering();
         StdDraw.setPenColor(StdDraw.BLACK);
    }
    public static void updateRoom() {
        StdDraw.clear(StdDraw.BLACK);
        StdDraw.pause(20);
    }
    
}

