package Miniprojekt;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Miniproject {

    public static void main(String[] args) {
    try {
        List<Ball> list_balls = new ArrayList<Ball>();
        int nr_of_balls;
        int balls_to_produce;
        Scanner s = new Scanner(System.in);
  
        System.out.println("Which task to run 1,1 = ball bouncing without gravity , 1,2 = ball bouncing with gravity or 2,1? :");
       
            
            double task = s.nextDouble();
        
        
        balls_to_produce = 1;
        nr_of_balls=0;
        if(task !=1.1 && task !=1.2 & task !=2.1) {
          System.out.println("Sorry but I have only made task 1.1 , 1.2 , 2.1 ");
        }
      
        if(task==1.2) {
            nr_of_balls=1;
        }
        if(task==2.1) {
        System.out.println("Number of balls?");
        nr_of_balls = s.nextInt();
        balls_to_produce = nr_of_balls;
        }
        Random yr = new Random();

        if(task==1.1 || task==1.2 || task ==2.1) {
        
            for(int i = 0; i<=balls_to_produce-1;i++) {
                double y = yr.nextDouble()*50+ 40;
                double x =-90+15*i;
                Ball b=new Ball(x, y);
                list_balls.add(b);
                if(i>12) {
                    list_balls.get(i).set_radius(3);
                    list_balls.get(i).set_x(-90+i);
                }
            }

            double t = 0.03;
            double G = 10;
            Room r= new Room();
            double x;
            double y;
            double radius;
         
            while(true) {
               
               r.updateRoom();
               if(nr_of_balls>0) {
                   for(int i = 0; i<nr_of_balls;i++) {
                       list_balls.get(i).bounceBallWithG(100, 100);
      
                   }
               }
               if(task == 1.1) {
              list_balls.get(0).bounceBall(100, 100);
               }
              
               checkIfBallsTouch(list_balls);
               for(int i = 0; i<list_balls.size() ;i++) {
                  x = list_balls.get(i).get_x();
                  y = list_balls.get(i).get_y();
                  radius = list_balls.get(i).get_radius();
                
                 list_balls.get(i).ballShow(x, y, radius);
                
               }
               StdDraw.show();
            }
        }
    }catch(InputMismatchException e)
      {
          System.out.println("Input has to be a decimal");
      }
   }
  
    public static void checkIfBallsTouch(List<Ball> list_balls) {
           
        double radius,x1,y1,x2,y2,vx1,vy1,vx2,vy2,vx1Rel,vy1Rel,dx,dy,distance,directionb2x,directionb2y,vx2Rel,vy2Rel;
        

           
            for(int i = 0; i<list_balls.size() ;i++) {
                    for(int j = 0; j<list_balls.size() ;j++) {

                        x1 = list_balls.get(i).get_x();
                        y1 = list_balls.get(i).get_y();
            
                        x2 = list_balls.get(j).get_x();
                        y2 = list_balls.get(j).get_y();
                        
                        vx1 = list_balls.get(i).get_vx();
                        vy1 = list_balls.get(i).get_vy();
                    
                        vx2 = list_balls.get(j).get_vx();
                        vy2 = list_balls.get(j).get_vy();
                    
                        vx1Rel = vx1 - vx2;
                        vy1Rel = vy1 - vy2;
                    
                        dx = (x2 - x1);
                        dy = (y2 - y1);
                        distance = Math.sqrt(dx*dx + dy*dy);
                        directionb2x = dx/distance;
                        directionb2y = dy/distance;
                        vx2Rel = directionb2x*(directionb2x*vx1Rel + directionb2y*vy1Rel);
                        vy2Rel = directionb2y*(directionb2x*vx1Rel + directionb2y*vy1Rel);
                        vx1Rel = vx1Rel - vx2Rel;
                        vy1Rel = vy1Rel - vy2Rel;
                    
                        vx1 = vx1Rel + vx2;
                        vy1 = vy1Rel + vy2;
                        vx2 = vx2Rel + vx2;
                        vy2 = vy2Rel + vy2;
                     
                    
                        radius = list_balls.get(i).get_radius();
                        if(i!=j) {
                            if((list_balls.get(i).get_nextXPos()) <= x2+radius &&
                                    (list_balls.get(i).get_nextXPos()) >= x2-radius) {
                                    if((list_balls.get(i).get_nextYPos()) <= y2+radius &&
                                             (list_balls.get(i).get_nextYPos()) >= y2-radius) {
                                        list_balls.get(i).set_vx(vx1);
                                        list_balls.get(i).set_vy(vy1);
                                        list_balls.get(j).set_vx(vx2);
                                        list_balls.get(j).set_vy(vy2);

                                    }
                            }
                        }
                    }
            }
    }
}
          
           
    
      
      
        
    

