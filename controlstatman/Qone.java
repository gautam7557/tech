package controlstatman;

public class Qone {
    public static void main(String[] args) {
          int num = 55;
          int num1 = 55;
        //   if(num>num1){
        //     System.out.println(num + "num is greater than num1");
        //   }
        //   else if(num<num1){
        //     System.out.println(num + "num is less than num1");
        //   }
        //   else if(num==num1){
        //     System.out.println(num + "num is both num1");
        //   }
        String a = (num>num1)?(num +"num is greater than num1"):(num==num1?num +"num is both num1":num +"num is less than num1");
        System.out.println(a);
    }
}
