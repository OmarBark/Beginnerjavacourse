import java.util.*;

public class Max {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(Max3(6,2,9));
    }
    public static int  Max2(int a, int b) {
        if(a>b) {
            return a;
        } else return b;
        
        
    }
    
    
    public static int Max3(int a,int b,int c) {
        int d = Max2(a,b);
        int e = Max2(c,d);
        
        return e;
        
    }

}

