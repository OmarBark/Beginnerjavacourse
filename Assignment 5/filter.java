import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class filter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
         Picture pic = new Picture("dog.jpg");
         Picture p = new Picture(900,500);
         JFrame f = new JFrame();

         
         int cx = pic.width()/2;
        int cy = pic.height()/2;
         for(int x=0;x<pic.width();x++) {
            for(int y=0;y<pic.height();y++) {
           double xr = cx +(x-cx)*Math.cos((double)30)+ (y-cy)*Math.sin(-60);
           double yr = cy -(x-cx)*Math.sin((double)-60)+ (y-cy)*Math.cos(30);
       
           
           Color c = pic.get(x, y);
           p.set((int)xr, (int)yr, c);
            }
           }
         Picture pp = new Picture(900,500);
     
         for(int i=0;i<p.width();i++) {
            for(int j=0;j<p.height();j++) {
                int x = 0;
                
                    x=j+80;
                if(x>499)
                { x=499;
                }
                Color c = p.get(i/3+1000*1/3, x);
                pp.set(i,j, c);
            }
        }
         
         Picture ppp = new Picture(900,390);
         for(int i=0;i<p.width();i++) {
            for(int j=0;j<p.height();j++) {
                Color c = pp.get(i, j);
                int x = 0;
                x = j;
                
                if(x>389) {
                    x=389;
                }
                ppp.set(i, x, c);
            }
            }
         Tiling t = new Tiling();
         t.changeSize(ppp, 800, 800);
         

      
       
    }
    
        
}
