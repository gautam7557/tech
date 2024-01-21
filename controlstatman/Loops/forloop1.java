package controlstatman.Loops;

public class forloop1 {
    public static void main(String[] args) {
        for(int i = 'n'; i!=10; i--){
            if(i%5==0){
            System.out.println(i);
            System.out.println("java is great");
            if(i==5){
                System.out.println("ending the loop");
                break;
            }
            i--;
        }
        System.out.println("loop end the here");
    }
}
}
