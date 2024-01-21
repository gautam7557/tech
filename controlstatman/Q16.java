package controlstatman;

public class Q16 {
    public static void main(String[] args) {
          int a = 45;
          int b = 45;
          int c = 52;
        //   if(a==b && a==c &&b==c){
        //     System.out.println("tringle is isoceles");

        //   }
        //   else if(a==b||a==c||b==c){
        //     System.out.println("tringle is scalene");
        //   }
        String m = (a==b && a==c &&b==c)?("tringle is isoceles"):(a==b||a==c||b==c?"tringle is isoceles":"tringle is scalene");
        System.out.println(m);
          
    }
}
