import java.util.*;
import java.io.*;

public class  Names{
    public static void main(String[] cmdLn) throws FileNotFoundException {
    
        File filen = new File("/Users/ob/namn.txt");
        Scanner s = new Scanner(filen);
      
        String[] b = new String[10];
        
        
        for(int i= 0 ; i<=9;i++) {
           String a= s.nextLine();
            b[i] = a;
       }
        
        Arrays.sort(b);
        for (String i : b) {
            System.out.println(i);
      }
   }
}
