import java.util.Arrays;
import java.util.Scanner;

public class Permutations {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
                
                Scanner s = new Scanner(System.in);
                System.out.println("n");
                int n = s.nextInt();
                double[] numbers = new double[n];
                int[] perm = new int[n];
                int[] permInv = new int[n];
                double[] numbersOld = new double[n];
                // Creating arrays
                for(int i = 0; i<n;i++) {
                    numbers[i]=Math.random(); //array numbers with random numbers between 0 and 1
                    perm[i]=i; // array perm
                    numbersOld[i]= numbers[i]; // giving all the elements in numbers to numbers old
                  
                }
                
                
                
                // sorting numbers using bubble sort
                boolean isSorted = false;
                while(!isSorted) {
                    isSorted = true;
                    int lastUnsorted =n-1;
                for(int j = 0; j<n-1;j++) {
                    if(numbers[j]>numbers[j+1]) {
                        double temp = numbers[j];
                        numbers[j]=numbers[j+1];
                        numbers[j+1]=temp;
                        
                        int temp1 = perm[j];
                        perm[j]=perm[j+1];
                        perm[j+1]=temp1;
                        isSorted=false;
                    }
                        
                }
                lastUnsorted--;
              }
                
                // creating PermInv
                  for(int i=0;i<n;i++) {
                       
                       permInv[perm[i]] = i;
       
                   }
                
                  
            
                  //Printing all the Arrays
                 // System.out.println(Arrays.toString(perm)+" perm");
                 // System.out.println(Arrays.toString(permInv)+" permInv");
                 // System.out.println(Arrays.toString(numbers)+" numbers");
                 // System.out.println(Arrays.toString(numbersOld)+" numbersOld");
                
                
                  
                  
                  int a=0;
                  for(int i=0;i<n;i++) {
                     if(numbers[permInv[i]] == numbersOld[i]) {
                        a++;
                     }
                  }
                  if(a==n) {
                      System.out.println("Verified");
                      
                  }else {
                      System.out.println("Not Verified");
                  }
                
            }

            

            
        }
