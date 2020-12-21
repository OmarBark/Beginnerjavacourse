
import java.awt.*;
import java.util.*;

import javax.swing.*;

public class Tiling {

    public static void main(String[] args) {
        // TODO Auto-g0enerated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("picture file");
        String picture = s.next();
         Picture pic = new Picture(picture);
         
         System.out.println("bilder i x led :");
         int x = s.nextInt();
         System.out.println("bilder i y led :");
         int y = s.nextInt();
         System.out.println("Width :");
         double width = s.nextDouble();
         System.out.println("Height :");
         double height = s.nextDouble();
      Picture p = multiplePictures(pic, x, y);
      changeSize(p, width, height);

     }
    public static Picture multiplePictures(Picture pic,int x,int y) {
           Picture p = new Picture(pic.width(),pic.height());
             
             
              
           
            
           
            for(int i =0;i<986/x;i++) {
                for(int j=0;j<555/y;j++) {
                     for(int q = 0; q<x;q++) {
                         for(int o = 0; o<y;o++) {
                    p.set(i+986*q/x, j+555*o/y, pic.get(i*x, j*y));
                }     }}}


            
            return p;
    }
    public static void changeSize(Picture pic,double width, double height) {
         double scalew = height/pic.width();
         double scaleh = height/pic.height();
         

         
         Picture scaled = new Picture((int)width,(int)height);
       
        for(int i =1 ; i<width;i++) {
            for(int j =1 ; j<height;j++) {
           int x = (int) (i/scalew);
           int y = (int) (j/scaleh);
           Color c = pic.get(x, y);
           scaled.set(i, j, c);
               }
            }
        scaled.show();
        }
    
    }

 
