import java.util.*;

public class Personnummer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Personnummer i format ÅÅÅÅMMDD-XXXX");
        String number = s.next();
    if(CheckForm(number)) {
        if(CheckValid(number)==true) {
            System.out.println("Det är ett riktigt personnummer");
        }else {
            System.out.println("Det är inte riktigt personnummer");
        }
    }else {System.out.println("Det är fel format");}
    
        
    }
    public static boolean CheckForm(String number) {
        
        
        int a = number.length();
        char binde = number.charAt(8);
       boolean form = false;
       String eight = number.substring(0,8);
       char[] eightArr = eight.toCharArray();
        if(a==13) {
            if(binde=='-') {
                for(int i=0;i<8;i++) {
                    char num = number.charAt(i);
                    if(num =='1' ||num =='2' ||num =='3' ||num =='4' ||num =='5' ||num =='6' ||num =='7' ||num =='8' ||num =='9'||num =='0') {
                        for(int j=9;j<13;j++) {
                             num = number.charAt(j);
                            if(num =='1' ||num =='2' ||num =='3' ||num =='4' ||num =='5' ||num =='6' ||num =='7' ||num =='8' ||num =='9'||num =='0') {
                                form=true;
                            }
                        }
                    }
                }
            }
        }
        
          
        
        
        return form;
        
        
    }
    public static boolean CheckValid(String number) {
        boolean valid =false;
        
        
        
        if (CheckForm(number)==true) {
            String eight = number.substring(0,8);
            char[] eightArr = eight.toCharArray();
            String four = number.substring(9,13);
            char[] fourArr =four.toCharArray();
            int [] numEight = new int[8];
            int [] numFour = new int[4];
            int a = 0, b=0,c=0,d=0,sum=0,a1=0,a2=0,b1=0,c1=0,d1=0,b2=0;
    
            for (int i = 0; i < 8; i++){
                numEight[i] = (int)eightArr[i]-48;
            }
            
            for (int i = 0; i < 4; i++){
                numFour[i] = (int)fourArr[i]-48;
            }
            
            
            
            for(int i=2;i<8;i=i+2) {
                 a = numEight[i]*2;
                 if(a>9) {
                     int firstDigit = Integer.parseInt(Integer.toString(a).substring(0, 1));
                     int secondDigit =Integer.parseInt(Integer.toString(a).substring(1, 2));
                     a2= firstDigit+secondDigit;
                     a1=a1+a2;
                 }
                 if(a<10) {
                 a1=a1+a;
                 }
            }
            
            for(int i=3;i<8;i=i+2) {
                 c = numEight[i];
            
                 c1 = c1+c;
            
            }
            for(int i=0;i<4;i=i+2) {
                 b = numFour[i]*2;
                 if(b>9) {
                     int firstDigit = Integer.parseInt(Integer.toString(b).substring(0, 1));
                     int secondDigit =Integer.parseInt(Integer.toString(b).substring(1, 2));
                     b2= firstDigit+secondDigit;
                     b1=b1+b2;
                 }
                 if(b<10) {
                 b1=b1+b;
                 }
                
            }
            for(int i=1;i<4;i=i+2) {
                d = numFour[i];
                 d1 = d1+d;
            }
            sum= a1+b1+c1+d1;
            if(sum%10==0) {
                valid=true;
            }
            
        }
        return valid;
        
        
    }
    
    
    
    }

