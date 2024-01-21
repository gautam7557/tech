package controlstatman;

public class Q28 {
    public static void main(String[] args) {
        int num = 25487;
		int rem,sum = 0,a = num;
		if(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(a == sum)
			System.out.print("Eqaul..");
		else			
			System.out.print("Not Eqaul..");
    }
}
