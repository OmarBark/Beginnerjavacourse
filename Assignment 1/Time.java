
import java.util.*;



public class Time{
    public static void main(String[] cmdLn){
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Sekunder: ");
        int sec = s.nextInt(); //antalet sekunder
        
        int min = 60;
        int hours = min*60;
        int days = hours*24;
       
        int amountOfDays = sec/days;
        int rest = sec%days;
        int amountOfHours = rest/hours;
        int rest1 = rest%hours;
        int amountOfMinutes = rest1/min;
        int rest2 = rest1%min;
        int amountOfSeconds = rest2;
        
        System.out.println(amountOfDays + " Antalet dagar " + amountOfHours + " antalet timmar " + amountOfMinutes + " antalet minuter " + amountOfSeconds + " antalet sekunder ");
        
        
    }
    
}
