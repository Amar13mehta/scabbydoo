import java.io.*;
import java.util.*;
import java.lang.reflect.Array; 

public class Solution {

    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int L = A.length();
       int j =L-1;  
       for(int i=0;i<=(L/2);i++)
       {
          if(A.charAt(i)==A.charAt(j))
          {
            j--;
            
          }
          else
          {
          System.out.print("No");
          return;
          }
         
       }
        System.out.print("Yes");
    
 
    }
}



