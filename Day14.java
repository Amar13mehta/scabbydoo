
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amar PC
 */
public class D {
    
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int a  = s.nextInt();
    int[] ar=new int[a];
    int b;
    float p;
    float n;
    float zero;
    
    for(int i=0;i<a;i++)
       {
        b=s.nextInt();
        ar[i]=b;
       }
    float q=0;
    float w=0;
    float z=0;
     for(int t=0;t<a;t++)
      {
         if(ar[t]<0)
         {
           q++;
           
         }
         else if(ar[t]>0)
         {
           w++;
          
         }
         else if(ar[t]==0)
         {
             z++;
         }
      }
     p=q/a;
     n=w/a;
     zero=z/a;
     System.out.println(""+n);
     System.out.println(""+p);
     System.out.println(""+zero);
     
      
     
    }
    
    
}
