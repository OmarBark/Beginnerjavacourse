import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.*;



public class BenfordsLaw {
    public static void main(String[] args) throws FileNotFoundException {
        File filen = new File("/Users/ob/data(1).txt");
        Scanner s = new Scanner(filen);
        
        List<Integer> list = new ArrayList<Integer>();
        int number=0;
       while(s.hasNextInt()) {
            
               number = s.nextInt();
               list.add(number);
       }
       int c = list.size();
      int firstDigit[] = new int[c];
      for(int i = 0;i<c;i++) {
          firstDigit[i]= getLeadingDigit(list.get(i));
        
      }
      printTable(firstDigit, c);
      
       }

    public static int getLeadingDigit(int a)  {
   
      
         int firstDigit = Integer.parseInt(Integer.toString(a).substring(0, 1));

        return firstDigit;
        
    }
    public static int calculateOccurencies(int[] firstDigit,int c){
    int occurencies[]=new int[9];
    
    for(int j = 0; j<firstDigit.length;j++) {
    for(int i= 1;i<=9;i++) {
        if(firstDigit[j]==i) {
            occurencies[i-1]=occurencies[i-1]+1;
        }
    }}
        return occurencies[c-1];
        
    }
    public static double calculateStatistics(int[] firstDigit, int c,int d) {
        double[] procentage= new double[9];
        double occurencies = 0;
        for(int i=0;i<9;i++) {
            occurencies = calculateOccurencies(firstDigit, 1+i);
            procentage[i]= occurencies/ c;
        }
        return procentage[d];
    }
    public static void printTable(int[] firstDigit, int c){
        DecimalFormat df = new DecimalFormat("#.#");

        for(int i=0;i<9;i++) {
            double a = calculateStatistics(firstDigit, c, i);
            int q= i+1;
        a= a*100;
            System.out.println("# "+q +": "+ df.format(a));
        }
    }
}

