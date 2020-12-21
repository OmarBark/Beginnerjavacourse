import java.util.*;




public class PytTrippel{
    public static void main(String[] cmdLn){
        Scanner s = new Scanner(System.in);
        System.out.print("N: ");
    
        int N = s.nextInt();
        for (int z=1; z<=N; z++){
            for (int y=1; y<=z; y++){
                for (int x=1; x<=y; x++){
                    int Z = z*z;
                    int Y = y*y;
                    int X = x*x;
                    if(Z==X+Y){
                    
        
        System.out.print("("+x+","+y+","+z+")");
                        System.out.println(" ");
                    }
                }
            }
        }
    }
}
    

