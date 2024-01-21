package controlstatman;

public class Q6 {
    public static void main(String[] args) {
        int year = 5000;
        String a = (year%4==0)? ("it is a leap year"):(year%400!=0?"IT is a leap year":"it is a not leap year");
        System.out.println(a);
    }
        
    }
