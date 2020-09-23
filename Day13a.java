import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class A {

 
     public static void main(String[] args) {
     
     Scanner s = new Scanner(System.in);
        
          int[] ar = new int[3];
          int[] br = new int[3];
         int z;
         int x;
         for( int t=0;t<3;t++)
         {
               z = s.nextInt();
               ar[t]=z;
         }
          
         for( int i=0;i<3;i++)
         {
               x = s.nextInt();
               br[i]=x;
         }
         int r=0;
         int g=0;
         for(int j=0;j<3;j++)
         {
           if(ar[j]>br[j])
           {
           r++;
           }
           else if(ar[j]<br[j])
           {
           g++;
           }
         }
         System.out.print(r+" "+g);
     }
}

    