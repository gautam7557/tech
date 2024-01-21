package controlstatman;

public class Q20 {
    public static void main(String[] args) {
        double basic_salary = 30000;
        double HRA , DA;
        if(basic_salary <=10000){
            HRA = basic_salary*0.20;
            DA = basic_salary*0.80;
            System.out.println("the gross salary :" +(basic_salary+HRA+DA));
        }
        else if(basic_salary <= 2000)
        {
            HRA = basic_salary*0.25;
            DA = basic_salary*0.90;
            System.out.println("the gross salary :" +(basic_salary+HRA+DA));
        }
        else if(basic_salary > 20000)
        {
            HRA = basic_salary*0.30;
            DA = basic_salary*0.95;
            System.out.println("the gross salary :" +(basic_salary+HRA+DA));
        }
        else
        {
            System.out.println("Nothing");
        }

    }
}
