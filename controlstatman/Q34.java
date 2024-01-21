package controlstatman;

public class Q34 {
    public static void main(String[] args) {
        int days = 6;
        float fine = 8.5f;
        if (days > 0 && days <= 5){
        fine = 0.50f * days;
        System.out.println(days +"Your membership not would be canceled" );
        }
   else if (days >= 6 && days <= 10){
        fine = 1 * days;
        System.out.println(days +"Your membership would be canceled");
    }

   else if (days > 10){
        fine = 5 * days;
        System.out.println(days + "Your membership would be canceled");
   }

        else{
            System.out.println(fine +"You have to pay Rs. %.2f fine");
            
        
        }
        
   }
}
