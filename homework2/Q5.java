package homework2;

public class Q5 {
    int virat;
    int years;
    Q5()
    {}
    
    Q5(int a, int b)
    {
        virat = a;
        years = b;
        
    }
    public static void main(String[] args) {
        india();
        Q6.shouthaferica();
    }
    static void india()
    {
        Q5 p = new Q5(103,65);
        System.out.println(p.virat);
        System.out.println(p.years);




    }
}
    class Q6{
        int suraj;
        int bumhra;
        Q6()
        {}
    Q6(int c,int d){
        suraj = c;
        bumhra = d;



    }
    static void shouthaferica()
    {
        Q6 q = new Q6(3, 2);
        System.out.println(q.suraj);
        System.out.println(q.bumhra);



    }
    }
