package controlstatman;

public class Stitac {
     public static void main(String[] args) {
        System.out.println("This is the main of static");
        int x = 18;
        int y = 20; 
        int ans = Gautam(x,y);
        System.out.println(ans);
        
     }
     static int Gautam(int x , int y)
     {
        int ans = x+y;

        return ans;
     }
    
}
class static1{
    public static void main(String[] args) {
        System.out.println("This is the main of static1");
        int x = 15;
        int y = 20;
        int ans = yadav(x,y);
        System.out.println(ans);

        
    }

    static int yadav(int x, int y )
    {
        int ans = x+y;
        return ans;
    }
}
