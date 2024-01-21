package homework2;

import java.time.Month;
import java.util.Scanner;

public class foorloop2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Month mon;
      for (int mn=1; mn<=12; mn++){
         
         // The first month starts with number 1
         mon = Month.of(mn);
         System.out.println(mon);
      }
    
    }
}
