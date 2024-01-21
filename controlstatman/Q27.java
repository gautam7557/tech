package controlstatman;

public class Q27 {
    public static void main(String[] args) {
        int yos = 10;
		System.out.print("M");
		char gen = 'm';
		System.out.print("(Graduate(0) , Post-Graduate(1)) :");
		int qual = 0;
		int salary = 0;
		if(gen=='m' && yos>=10 && qual==1)
		{			
			salary = 15000;
		}
		else if( (gen=='m' && yos>=10 && qual==0) || ( gen=='m' && yos<10 && qual==1 ) || ( gen=='f' && yos<10 && qual==1))
		{			
			salary = 10000;
		}
		else if(gen=='m' && yos<10 && qual==0)
		{			
			salary = 7000;
		}
		else if(gen=='f' && yos>=10 && qual==1)
		{			
			salary = 12000;
		}
		else if(gen=='f' && yos>=10 && qual==0)
		{			
			salary = 9000;
		}
		else if(gen=='f' && yos<10 && qual==0)
		{			
			salary = 6000;
		}
		System.out.println("Salary : " + salary);
	
    }
}
