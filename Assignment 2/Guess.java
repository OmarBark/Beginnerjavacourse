import java.util.*;
public class Guess{
    public static void main(String[] cmdLn){
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int number = 1 + r.nextInt(10-1);
       boolean correct = false;
        while(!correct){
            System.out.print("Gissa numret: ");
            int guess = s.nextInt();
            
            if(guess == number){
                System.out.println("bravo");
                correct= true;
            }
            
          else if(guess != number) {
               System.out.println("försök igen");
              
        }
        
              
        }
    }
}
    
