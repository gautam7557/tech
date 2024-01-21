package controlstatman;

public class Q38 {
    public static void main(String[] args) {
        double num1 = 569875;
		double num2 = 654756;
		double num3 = 145789;
		if (num1 < num2 && num2 < num3)
		{
			System.out.println(num1 + "Numbers are in Increasing Order");
		}
		else if (num1 > num2 && num2 > num3)
		{
			System.out.println(num2 + "Numbers are in Decreasing Order");
		}
		else
		{
			System.out.println(num3 + "Neither Increasing or Decreasing Order");
        }
    }
}
