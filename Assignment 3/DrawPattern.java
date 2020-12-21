
import java.util.*;
import java.io.*;

public class DrawPattern{
    public static void main(String cmdLn[]) throws NumberFormatException, IOException
    {
        
        
        int[][] patterns = new int[16][2];
        int[][] coord = new int[85][2];
        int x=0, y=0, str_double = 0;
        int i = 0;
        BufferedReader in = new BufferedReader(new FileReader("/Users/ob/data.txt"));    //reading files in specified directory
            String line;
            
for(int a = 0; a <= 15; a++)

{
    line = in.readLine();
    String[] values = line.split(" ");


str_double = Integer.parseInt(values[0]);
patterns[a][0]=str_double;
str_double = Integer.parseInt(values[1]);
patterns[a][1]=str_double;

    
}
            
            while ((line = in.readLine()) != null)    //file reading
            {
                String[] values = line.split(" ");
            
            
                
                
                    str_double = Integer.parseInt(values[0]);
                    coord[i][0]=str_double;
                    str_double = Integer.parseInt(values[1]);
                    coord[i][1]=str_double;

                    
                
                
                i++;
            }
            StdDraw.setXscale(0, 300);
            StdDraw.setYscale(0, 300);
            for(int j = 0; j <= 15; j++)
            {
                int nr_lines = patterns[j][1]-patterns[j][0];
                int p1 = patterns[j][0];
                
                for(int k = 0; k < nr_lines; k++) {
                    int x1 = coord[p1 + k][0];
                    int y1 = coord[p1 + k][1];
                    int x2 = coord[p1+1 + k][0];
                    int y2 = coord[p1+1 + k][1];
                    StdDraw.line(x1, 300-y1, x2, 300-y2);
                }
            }
        

    


}
}


