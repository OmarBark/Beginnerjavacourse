
import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ange ditt kontonummer 10 siffror: ");
        String number = s.next();
        int N= checksum(number);
    System.out.println(number + extend_account(N));
    }
    
    public static int f(int a) {
        
    int multiply= a*2;
    int sum = 0;
        if(multiply>9) {
        int firstDigit = Integer.parseInt(Integer.toString(multiply).substring(0, 1));
         int secondDigit =Integer.parseInt(Integer.toString(multiply).substring(1, 2));
         sum= firstDigit+secondDigit;
        }else {
            sum= multiply;
        }
        return sum;
        
    }
    
    public static int checksum(String number) {
        int [] d= new int[number.length()];
         int sum1=0;
         int sum2=0;
        
        
         for(int i=0;i<number.length();i++) {
                String  a= number.substring(i, i+1);
                int b = Integer.parseInt(a);
                d[i]= b;
               
                
                }
                
            for(int i=0;i<d.length;i=i+2) {
                    int a= d[i];
                    sum1=sum1+a;
                    
                }
                
            for(int i=0;i<d.length-1;i=i+2) {
                    
                    int a = f(d[i+1]);
                    sum2= sum2+a;
                
                }
                int N=sum1+sum2;
    
        
        return N;
        
    }
    public static boolean allowed(int N) {
        boolean allowed=false;
        
        
        
        if(N%10==0) {
            allowed=true;
        }
        
        return allowed;
        
    }
    
    public static int extend_account(int N) {
    int extraNumber = 0;

    if(allowed(N)==false) {
        for (int i=0;i<10;i++) {
            extraNumber= i;
            int withExtraNumber= N + extraNumber;
            if(allowed(withExtraNumber)==true) {
                return extraNumber;
            }
        }
    }
    
    
    
    
        return extraNumber;
        
    }

}

