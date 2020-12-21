import java.util.Random;

public class BallVolume{
     public static void main(String[] cmdLn){
            Random rand = new Random();
            boolean inside = false;
      
            int q = 0;
            double c = 100000000;
            double d = 8;
            
            for(int i = 1; i<=100000000; i++){
            
                
                
                    double x = 0 + rand.nextDouble()*1;
                    double y = 0 + rand.nextDouble()*1;
                    double z = 0 + rand.nextDouble()*1;
                    
                    double X = x*x;
                    double Y = y*y;
                    double Z = z*z;
                    ;
                   
                    if(X+Y+Z<=1){
                     q++;
                       
                }
                }
           
            double m = c/q;
            double V = d/m;
            System.out.println("mean is equal to: " + m);
            System.out.println("Volume is equal to: " +V);
                }
                
           
           
             
         
         
     }


