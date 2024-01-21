package controlstatman;

public class Q26 {
    public static void main(String[] args) {
        char gen = 'f ';
        char status = 'U';
        int age = 23;
		System.out.print("Enter the Gender M :");
		
		System.out.print("Enter the Marital Status U :");
		if(status == 'M' || status == 'm')
		{			
			System.out.println("Driver should be Insured.");
		}
		else if(status == 'U' && gen == 'M' && age > 30 || status == 'u' && gen == 'm' && age > 30)
		{			
			System.out.println("Driver should be Insured.");
		}
		else if(status == 'U' && gen == 'F' && age > 25 || status == 'u' && gen == 'f' && age > 25)
		{			
			System.out.println("Driver should be Insured.");
		}
		else
		{			
			System.out.println("Driver should not be Insured.");
		}
    }
}
