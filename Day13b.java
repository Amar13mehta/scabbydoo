import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class B {
    
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    long[] ar = new long[n];
    long i;
    for(int t=0;t<n;t++)
    {
        i=s.nextLong();
        ar[t]=i;
    }
    long sum = 0;
    for(int z=0;z<n;z++)
    {
    sum = sum +ar[z];
    }
    System.out.print(""+sum);
    
    }
    
    
    
    
}
