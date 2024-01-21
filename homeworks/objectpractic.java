package homeworks;

public class objectpractic {
    String state;
        String captial;

    objectpractic(String g , String h)
    {
        state= g;
        captial=h;

    

    }
public static void main(String[] args) {
    objectpractic a = new objectpractic("bihar" , "patna");
     objectpractic b = new objectpractic("mp" , "bhopal");
      objectpractic c = new objectpractic("up" , "delhi");
      System.out.println(a.state);
      System.out.println(a.captial);
      System.out.println(b.state);
      System.out.println(b.captial);
      System.out.println(c.state);
      System.out.println(c.captial);



    
}
    
}
