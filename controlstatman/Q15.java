package controlstatman;

public class Q15 {
    public static void main(String[] args) {
        int a = 40;
        int b = 42;
        int c = 43;
        // if((a+b)<c){
        //     System.out.println("tringle is valied.");
        // }
        // else if((c+b)>a){
        //     System.out.println("tringle is not valied.");
        // }
        // else
        // {
        //     System.out.println("tringle is not valied.");
        // }
        String s = ((a+b)<c)?("tringle is valied."):((c+b)>a?"tringle is not valied.":"tringle is not valied.");
        System.out.println(s);

    }
}
