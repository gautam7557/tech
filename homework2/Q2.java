package homework2;

public class Q2 {
    String animal;
    String name;
    Q2(String a, String b)
    {
        animal = a;
        name = b;


    }
    public static void main(String[] args) {
        Q2 m = new Q2("lion","sharu");
        Q2 n = new Q2("tiger","daku");
         Q2 o = new Q2("dog","tony");
         System.out.println(m.animal);
         System.out.println(m.name);
         System.out.println(n.animal);
         System.out.println(n.name);
         System.out.println(o.animal);
         System.out.println(o.name);
        
    }
}
