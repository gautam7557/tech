package homeworks;

public class nonstaticmethod {
    nonstaticmethod()
    {
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        int a = 10;
        nonstaticmethod var=new nonstaticmethod();
        var.youvraj(a);
        
        
    }


    void youvraj(int a)
    {
        int ans = a*a*a;
        System.out.println(ans);


    }

    
}
