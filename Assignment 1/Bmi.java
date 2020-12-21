import java.util.*;

public class Bmi{
    public static void main(String[] cmdLn){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Vikt i kilo?: ");
        int w = s.nextInt();
        System.out.print("Längd i meter: ");
        double l = s.nextDouble();
        double bmi = w/(l*l);
        
        System.out.println("Din bmi är " + bmi);
        
    }
    
}
