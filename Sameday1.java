
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         if(2<=N&&N<=5)
         {
            if( N%2==0)
         System.out.print("Not Weird");
         else 
         System.out.print("Weird");
         }
         else if(6<=N&&N<=20 ){ 
         
            if( N%2==0)
         System.out.print("Weird");
         
         }
         else if(N>20)
         {
             if(N%2==0)
         System.out.print("Not Weird");
             else 
         System.out.print("Weird");
         }
         
         
         
        scanner.close();
    }