package controlstatman;

public class Q32 {
    public static void main(String[] args) {
        float len = 5;
		float bre = 4;
		float area = len * bre;
		float perimeter = 2 * (len+bre);
		// if(area>perimeter) 
		// {
		// 	System.out.println("Area of rectangle is greater than  Perimeter");
		// }
		// else
		// {
		// 	System.out.println("Perimeter of rectangle is greater than Area");
		// }
        String z = (area>perimeter)?("Area of rectangle is greater than  Perimeter"):("Perimeter of rectangle is greater than Area");
        System.out.println(z);
    }
}
