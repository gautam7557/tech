package controlstatman;

public class Q30 {
    public static void main(String[] args) {
        int angle1 = 98;
		int angle2 = 96;
		int angle3 = 94;
		int sum = angle1 + angle2 + angle3; 
		// if(sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) 
		// {
		// 	System.out.println("Triangle is valid");
		// }
		// else
		// {
		// 	System.out.println("Triangle is not valid");
		// }
        String a = (sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0)?("Triangle is valid"):("Triangle is not valid");
        System.out.println(a);
    }
}
