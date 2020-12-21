import java.util.*;

public class CheckDate{
    public static void main(String[] cmdLn){
        Scanner s = new Scanner(System.in);
        System.out.print("Year: ");
        int year = s.nextInt();
         System.out.print("month: ");
         int month = s.nextInt();
         System.out.print("day: ");
         int day = s.nextInt();
         int dayMax=31;
         int dayMin = 1;
         
         
         int[] month31 = {1,3,5,7,8 ,10,12};
         
         int[] month30 = {4,6,9,11};
         
         int februari = 28;
         int LeapYear1 = year%400;
         int LeapYear2 = year%4;
         int LeapYear2_ = year%100;
         
         boolean isLeapYear = LeapYear1 == 0 || LeapYear2 == 0 && LeapYear2_>1;
         if(isLeapYear == true)    {
             februari++;
             
         }
        
       for( int i : month31) {
           if(i == month) {
               boolean valid = dayMin<= day && day <=dayMax;
               System.out.println("It is "+valid+" that it is a valid day ");
           }
           
           
       }
      
       for( int x : month30) {
           if(x == month) {
               boolean valid = dayMin<= day && day <=30;
               System.out.println("It is "+valid+" that it is a valid day ");
           }
           
           
       }
       
      
            
        
        if(month==2) {
            boolean valid = dayMin<= day && day <=februari;
            System.out.println("It is "+valid+" that it is a valid day ");
        }
        
            
   }
}
    
