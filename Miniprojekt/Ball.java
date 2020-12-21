package Miniprojekt;

import java.awt.Color;
import java.math.*;
import java.util.List;
public class Ball {


    
     double vy;
    private double G;
    private double t;
     double vx;
    private double radius;
    private double y;
    private double x;
    
    
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 10;
        this.vx = 5;
        this.vy = 5;
        this.t = 0.3;
        this.G = 10;
        
    }
    
   
    
    public  double get_x() {
        return this.x;
        
    }
    public  double get_y() {
        return this.y;
        
    }
    public  double get_vx() {
        return this.vx;
        
    }
    public  double get_vy() {
        return this.vy;
        
    }
    public  double get_nextYPos() {
        return this.y + t*vy - G*(t*t/2.0);
        
    }
    public  double get_nextXPos() {
        return this.x +t*vx;
        
    }
    
    public double get_radius() {
        return this.radius;
    
        
    }
    public void set_vx(double a) {
        this.vx = a;
        
        
    }
    public void set_vy(double a) {
        this.vy = a;
        
        
    }
    public void set_radius(double a) {
        this.radius = a;
        
        
    }
    public void set_x(double a) {
         this.x = a;
         
         
     }
     public void bounceBallWithG(double roomWidthEnd, double roomHeightEnd) {
         
             
        double x=this.x, y=this.y, vx=this.vx, vy=this.vy, radius=this.radius,t=this.t, G=this.G;
            
             
        if (Math.abs(x +t*vx) > roomWidthEnd - radius)
            {this.vx = -vx;}
             this.x = x + t*this.vx;
             
        if (Math.abs(y + t*vy - G*(t*t/2.0)) > roomHeightEnd  - radius)
            {vy = -vy;

            }
            
             this.y = y + t*vy - G*(t*t/2.0);
             this.vy = vy - G*t;
            
             
     }
     
     public void bounceBall(double roomWidthEnd, double roomHeightEnd) {
            double x=this.x, y=this.y, vx=this.vx, vy=this.vy, radius=this.radius,t=this.t, G=this.G;
            
             
            if (Math.abs(x +t*vx) > roomWidthEnd - radius)
                {this.vx = -vx;}
                 this.x = x + t*this.vx;
                 
            if (Math.abs(y + t*vy) > roomHeightEnd  - radius)
                {this.vy = -vy;

                }
                
                 this.y = y + t*vy;
             
    
        
    }
    
   public static void  ballShow(double x,double y,double radius) {
           

        
       Color c[]= {StdDraw.PINK,StdDraw.BLUE,StdDraw.BOOK_RED,StdDraw.LIGHT_GRAY,StdDraw.ORANGE};
       
        StdDraw.filledCircle(x, y, radius);
        StdDraw.setPenColor(c[0]);
    
    
        
        
    }

    
}

