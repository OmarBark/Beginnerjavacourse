import java.util.*;

public class NameReversed{
    public static void main(String[] cmdLn){
      Scanner s = new Scanner(System.in);
        
        System.out.print("Förnamn: ");
        String firstName = s.next();
        System.out.print("Efternamn: ");
        String surName = s.next();
        
        System.out.println(surName + " " + firstName);
        
        
    }
    
}
