package controlstatman;

public class Q25 {
    public static void main(String[] args) {
        int m1 = 400;
		int m2 = 300;
		int m3 = 300;
		int m4 = 200;
		int m5 = 100;
		int tot = m1+m2+m3+m4+m5;
		float per = tot/5;
		System.out.println("Total :"+tot);
		System.out.println("Percentage :"+per);	
		if(per>=60)
		{			
			System.out.println("First Division.");
		}
		else if(per>=50 && per<=59)
		{			
			System.out.println("Second Division.");
		}
		else if(per>=40 && per<=49)
		{			
			System.out.println("Third  Division.");
		}
		else
		{			
			System.out.println("Fail.");
		}
    }
}
