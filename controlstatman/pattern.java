package controlstatman;
import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt();

            for (int r=1, p = 1; r<=n; r++,p+=2);
        
                for(int r=1; r<=n; r++)
                {
                    for(int c=1; c<=r; c++)
                    {
                        System.out.println(p + " ");


                }
                System.out.println();
            }

        }
        
    }
}
