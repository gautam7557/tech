package controlstatman;

public class Q19 {
    public static void main(String[] args) {
        int a = 55;
        int b = 56;
        int c = 57;
        int d = 44;
        int sum = a+b+c+d;
        int percentage = (sum/2);
    //     if(percentage >=100){
    //         System.out.println("Grade A");
    //     }
    //     else if(percentage >=100){
    //         System.out.println("Grade B");
    //     }
    //    else  if(percentage >=90){
    //         System.out.println("Grade C");
    //     }
    //      else if(percentage >=80){
    //         System.out.println("Grade D");
    //     }
    //     else if(percentage >=70){
    //         System.out.println("Grade E");
    //     }
    //     else if(percentage >=60){
    //         System.out.println("Grade F");
    //     }
    //     else
    //     {
    //         System.out.println("No greade");
    //     }
        String n = (percentage >=100)?("Grade B"):(percentage >=90?"Grade C":percentage >=80?"Grade D":percentage >=70?"Grade E":percentage >=60?"Grade F":"No greade");
        System.out.println(n);



    }
}
