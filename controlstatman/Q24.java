package controlstatman;

public class Q24 {
    public static void main(String[] args) {
        float bs = 60000;
		float hra,da,gs;
		if(bs<1500)
		{			
			hra=bs*0.1f;
			da=bs*0.9f;
		}
		else
		{			
			hra=500;
			da=bs*0.98f;
		}		
		gs = bs+hra+da;
		System.out.println("Gross Salary Rs:"+gs);
    }
}
