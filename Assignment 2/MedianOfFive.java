import java.util.*;


public class MedianOfFive {
    public static void main(String[] cmdLn){
        Scanner s = new Scanner(System.in);
        System.out.print("N1: ");
        int N1 = s.nextInt();
        System.out.print("N2: ");
        int N2 = s.nextInt();
        System.out.print("N3: ");
        int N3 = s.nextInt();
        System.out.print("N4: ");
        int N4 = s.nextInt();
        System.out.print("N5: ");
        int N5 = s.nextInt();
        int[] ints = {N1,N2,N3,N4,N5};
         
       Arrays.sort(ints);

       System.out.printf("The numbers are: "+  Arrays.toString(ints));
       System.out.println(" ");
        System.out.println("The median is :"+ints[2]);
    }

}

