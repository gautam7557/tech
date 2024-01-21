public class ifcondition {
    public static void main(String[] args) {
        int year = 2000;
        if(year%4 == 0){
            System.out.println("It is a leap year");
            
        }
        if(year%100 ==0){
            System.out.println("IT IS A LEAP YEAR");
        }
    else if(year%400 == 0){
        System.out.println("It is not a leap year");

        }
        String a = year%4 == 0 ? year%100 ==0 ? "It is a leap year":year%400 == 0 ?:"It is not a leap year";
    
        
