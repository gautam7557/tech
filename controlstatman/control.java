package controlstatman;

public class control {
    public static void main(String[] args) {
        int x = 50;
        int y = 60;
        int z = 65;
        //  if(x<y){
        //     System.out.println("x is maxiamnum number");
        // }
        // if(x==y){
        //     System.out.println("x is the both number y");
        // }
        // if(x>z){
        //     System.out.println("z is less than x");

        // }
       String a = (x<y)?("x is less number y"):(x==y?"x is the both number y":"z is less than x");
       System.out.println(a);
    }
}
