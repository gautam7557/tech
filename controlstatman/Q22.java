package controlstatman;

public class Q22 {
    public static void main(String[] args) {
        int qty = 505;
		System.out.print("Enter the Amount Per Item : ");
		float amt = 555.5f;
		float exp;
		if(qty>100)
		{			
			exp = qty * amt; 
			exp = exp-(exp * 0.1f);
		}
		else
		{
			exp = qty * amt; 
		}		
		System.out.println("Total Expenses is : "+exp);
    }
}
