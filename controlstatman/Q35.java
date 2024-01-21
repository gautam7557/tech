package controlstatman;

public class Q35 {
    public static void main(String[] args) {
        float hrs = 10.10f;
		if(hrs>=2 && hrs<=3) 
		{
			System.out.println("Worker is Highly Efficient");
		}
		else if(hrs>3 && hrs <=4) 
		{
			System.out.println("Worker Needs to Improve Speed");
		}
		else if(hrs>4 && hrs <=5) 
		{
			System.out.println("Give Training to Worker");
		}
		else
		{
			System.out.println("Worker is Leave the Company");
		}
    }
}
