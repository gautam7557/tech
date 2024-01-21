package controlstatman;

public class Qtwo {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 50;
        int num3 = 52;
        // if(num1>num2){
        //     System.out.println(num1 + "num1 is maxiam number than num2");
        // }
        // else if(num1<num2 && num3>num1 && num2<num3){
        //     System.out.println(num3 + "maxiam number");
        // }
        //  else{
        
        //     System.out.println(num3 + "num3 is maxiam number than num1");
        //  }
        String a = (num1>num2)?(num1 + "num1 is maxiam number than num2"):(num1<num2 && num3>num1 && num2<num3?num3 + "maxiam number":num3 + "num3 is maxiam number than num1");
        System.out.println(a);

        }

        }
    


