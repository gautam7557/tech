package controlstatman;

public class Q42 {
    Q42()
    {
        System.out.println("counstructor");
    }
     int Gautam(int a , int b)
    {
        int ans = a+b;


        return ans;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
      Q42 var = new Q42();
      int ans = var.ans(a, b);
      System.out.println("ans is = " + a);
    }
    private int ans(int a, int b) {
        return 0;
    }
}
