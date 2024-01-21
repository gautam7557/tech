package homework2;

public class Q3 {
    String month;
    int days;
    Q3(String a ,int b)
    {
        month=a;
        days=b;

    }
    public static void main(String[] args) {
        kashu p = new kashu("india","newdelhi");
        kashu q = new kashu("USA","washington");
        System.out.println(p.country);
        System.out.println(p.captial);
        System.out.println(q.country);
        System.out.println(q.captial);
        Q3 g = new Q3("jaunary",30);
        Q3 h = new Q3("february",29);
        Q3 i = new Q3("march",30);
        System.out.println(g.days);
        System.out.println(g.month);
        System.out.println(h.days);
        System.out.println(h.month);
        System.out.println(i.days);
        System.out.println(i.month);


        
    }
}
     class kashu {
        String country;
        String captial;
        kashu(String a,String b)
        {
            country = a;
            captial = b;

        }
    }

