import java.util.*;

public class OrderCheck{
    public static void main(String[] cmdLn){
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int number = 100 + r.nextInt(999 - 100);
        
        //System.out.println("Talet: " + number);
        
        
        int firstNumber = number/100;
        int rest = number%100;
        int secondNumber = rest/10;
        int rest1 = rest%10;
        int thirdNumber = rest1;
        
        boolean checkOrder = (firstNumber >= secondNumber) && (secondNumber>= thirdNumber) || (firstNumber <= secondNumber) && (secondNumber <= thirdNumber);
        
        System.out.println(number + ":" + checkOrder);
        
    
        
        
        
       
        
        
    }
    
}

