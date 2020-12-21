import java.util.*;

public class LeapYear{
    public static void main(String[] cmdLn){
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int number = 2000 + r.nextInt(3000 - 2000);
        
        System.out.println("Year: " + number);
        
        
        int LeapYear1 = number%400;
        int LeapYear2 = number%4;
        int LeapYear2_ = number%100;
        
        boolean isLeapYear = LeapYear1 == 0 || LeapYear2 == 0 && LeapYear2_>1;
        
        System.out.println("It is " + isLeapYear + " thas it is a LeapYear");
        
    
        
        
        
       
        
        
    }
    
}
