import java.util.Scanner;

public class inpiut {
    public static void main(String[] args) {
        System.out.println("welcome to my cacluate");
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter the first number");
        // float firstnumber = input.nextFloat();
        // System.out.println("Enter the second number");
        // float secondnumber = input.nextInt();
        // float sum = firstnumber + secondnumber;
        // System.out.println("sum of your number is:" + sum);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstnumber = input.nextInt();
        System.out.println("Enter the secondnumber");
        int secondnumber = input.nextInt();
        int Multiplication = firstnumber * secondnumber;
        System.out.println("Multiplication of the number" + Multiplication);

    }

}
