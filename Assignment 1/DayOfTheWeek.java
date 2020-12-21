import java.util.*;

public class DayOfTheWeek{
    public static void main(String[] cmdLn){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Day: ");
        int day =  s.nextInt();
        
        System.out.println("month: ");
        int month =  s.nextInt();
        
        System.out.println("Year: ");
        int year =  s.nextInt();
        
        if (month < 3) {
                month += 12;
                year--;}
        
  
      
        int Y = year;
        int y = year%100;
        int c = Y/100;
        
        int m = month;
        
        
    
        
        int D = ((13*(m+1))/5 + y/4 + c/4 + day + y -2*c)%7;
        
      
  
        
        System.out.println(D);
        
    //Extra not in the task
        switch(D){
            case 0:
            System.out.println("Saturday");
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case -6:
            System.out.println("Sunday");
            break;
            case -5:
            System.out.println("Monday");
            break;
            case -4:
            System.out.println("Tuesday");
            break;
            case -3:
            System.out.println("Wednesday");
            break;
            case -2:
            System.out.println("Thursday");
            break;
            case -1:
            System.out.println("Friday");
            break;

                
                
        }
        
        
       
        
        
    }
   
}
