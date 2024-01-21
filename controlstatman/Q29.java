package controlstatman;

public class Q29 {
    public static void main(String[] args) {
        int age1 = 25;
        int age2 = 26;
        int age3 = 24;
        // if(age1>age2){
        //     System.out.println(age1 + "The yungest age in ram");
        // }
        // else if(age1>age2 ||age3>age2 || age1<age3){
        //     System.out.println(age2 + "the yungest age in shayam");
        // }
        // else
        // {
        //     System.out.println(age3 + "The yungest age in ajay");
        // }
        String c = (age1>age2)?(age1 + "The yungest age in ram"):(age1>age2 ||age3>age2 || age1<age3?age2 + "the yungest age in shayam":age3 + "The yungest age in ajay");
        System.out.println(c);
    }
}
