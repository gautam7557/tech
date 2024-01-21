package homework2;

public class Q1 {
    String name;
    int age;
    Q1(String a, int b)
    {
        name = a;
        age = b;
    }
    public static void main(String[] args) {
        Q1 x = new Q1("gautam" , 19);
        Q1 y = new Q1("shubham" , 21);
        Q1 z = new Q1("Anurag" , 22);
        Q1 v = new Q1("bharat" , 23);
        System.out.println(x.name);
        System.out.println(x.age);
        System.out.println(y.name);
        System.out.println(y.age);
        System.out.println(z.name);
        System.out.println(z.age);
        System.out.println(v.name);
        System.out.println(v.age);

        
        
    }
}
