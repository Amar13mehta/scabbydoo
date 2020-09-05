import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
      String h = "^\\s+";
      String f = s.replaceAll(h, "");
       String[] a = f.split("[ @#$%&*()-=!,?._'@]+"); 
        if(f.equals(""))
        {
           System.out.println(0); 
        }
        else{
       System.out.println(a.length);
       for(String b:a)
        {
          System.out.println(b);
        }
        scan.close();
        }
    }
}
