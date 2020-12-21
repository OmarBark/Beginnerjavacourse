import java.util.*;


public class CircleApproximation{

    
        public static void main(String cmdLn[])
        {StdDraw.setXscale(-1.5, 1.5);
        StdDraw.setYscale(-1.5, 1.5);
            
        
        
        
        double x1;
        double y1;
        double x2;
        double y2;
        

        
        Scanner s = new Scanner(System.in);
        System.out.print("N: ");
        int N = s.nextInt();
        int geoSeq[]=new int[N];
        
        for(int i=1; i<=N;i++)
            
        {
        
            geoSeq[i-1]=(int) (4*Math.pow(2, (i-1)));
           }
        
     

         double coord[][] = new double[geoSeq[N-1]+1][2];
         
         coord[0][0]=1;
         coord[0][1]=0;
         coord[1][0]=0;
         coord[1][1]=1;
         coord[2][0]=-1;
         coord[2][1]=0;
         coord[3][0]=0;
         coord[3][1]=-1;
         coord[4][0]=1;
         coord[4][1]=0;
                         
         
        
            
        for (int i = 0; i < N; i++) {
            
            
            double xy[][] = new double[geoSeq[N-1]+1][2];
            
            
        int     X= (int) (4*Math.pow(2, i));

            
                for (int k = 0; k < geoSeq[N-1]/2; k++) {
    
                    if(i==0) {
                     x1 = coord[k][0];
                     y1 = coord[k][1];
                     x2 = coord[1 + k][0];
                     y2 = coord[1 + k][1];
                
                    
                    
                    double q2x = x1 + 0.5*(x2-x1);
                    double q2y = y1 + 0.5*(y2-y1);
                    double p2x = q2x/Math.sqrt(q2x*q2x + q2y*q2y);
                    double p2y = q2y/Math.sqrt(q2x*q2x + q2y*q2y);
                    
                    
                    xy[2*k][0] = x1;
                    xy[2*k][1] =  y1;
                    xy[2*k+1][0] = p2x;
                    xy[2*k+1][1] = p2y;
                    xy[geoSeq[N-1]][0]= xy[0][0];
                    xy[geoSeq[N-1]][1]= xy[0][1];
                    }
                    if(i>0) {
                
                        
                         x1 = coord[k][0];
                         y1 = coord[k][1];
                         x2 = coord[1 + k][0];
                         y2 = coord[1 + k][1];
                        
                        
                        double q2x = x1 + 0.5*(x2-x1);
                        double q2y = y1 + 0.5*(y2-y1);
                        double p2x = q2x/Math.sqrt(q2x*q2x + q2y*q2y);
                        double p2y = q2y/Math.sqrt(q2x*q2x + q2y*q2y);
                        
                        
                        xy[2*k][0] = x1;
                        xy[2*k][1] =  y1;
                        xy[2*k+1][0] = p2x;
                        xy[2*k+1][1] = p2y;
                        xy[geoSeq[N-1]][0]= xy[0][0];
                        xy[geoSeq[N-1]][1]= xy[0][1];
            
                    }
                    
                
                    }
                
            
            
                    
                
                //TODO: Plot function
                for(int i1=0;i1<geoSeq[i];i1++) {
                    x1 = coord[i1][0];
                     y1 = coord[i1][1];
                     x2 = coord[1 + i1][0];
                     y2 = coord[1 + i1][1];
                    
                    StdDraw.line(x1,y1,x2,y2);
                    
                    }
                
                
                if(N>1) {
                    
                    
                    coord=xy;
                    
       }
     }
   }
}


