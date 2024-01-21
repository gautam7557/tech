package controlstatman;

public class Q23 {
    public static void main(String[] args) {
        int cy,yj;
        System.out.println("enter the current year and the year of joining-\n");
        cy=565;
        yj=458;
        // if(cy-yj>3){
        //     System.out.println("bonus of Rs 2500/-");
        // }
        // else{
        //     System.out.println("program error");
        // }
        String m = (cy-yj>3)?("bonus of Rs 2500/-"):("program error");
        System.out.println(m);
    }
}
