package controlstatman;

public class Q5 {
    public static void main(String[] args) {
        int num1 = 55;
        // if(num1%5==0){
        //     System.out.println(num1 + "divisival by five" );
        // }
        //  if(num1%11==0){
        //     System.out.println(num1 + "divisible by elevan");
        // }
        String x = (num1%5==0)?(num1 + "divisival by five"):(num1 + "divisible by elevan");
        System.out.println(x);

    }
}
