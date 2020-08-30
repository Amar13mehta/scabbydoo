import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String n = s.substring(0,k);
        String smallest = n;
        String largest = n;
        for(int i = k;i<s.length();i++)
        {
          n = n.substring(1,k)+s.charAt(i);
          if(largest.compareTo(n)<0)
             largest = n;
             if(smallest.compareTo(n)>0)
             smallest = n;

        }
       
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}