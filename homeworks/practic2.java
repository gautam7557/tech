package homeworks;

public class practic2 {
    practic2()
    {
        System.out.println("constructor");
    }
    void yadav(int a , int b)
    {
        int ans = a*b;
        System.out.println(ans);


    }
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        practic2 var=new practic2();
        var.yadav(a,b);

    }
    
}
