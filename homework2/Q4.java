package homework2;

import controlstatman.Stitac;

public class Q4 {
    Q4()
    {

    }
    int virat;
    int gill;
    Q4(int a,int b ){
        virat = a;
        gill = b;



    }
    public static void main(String[] args) {
       Q4 p = new Q4(0, 0);
       p.india();
       Q9 q = new Q9();
       q.shreelanka();
       
       
        

        
    }
    void india()
    {
       Q4 a = new Q4(88,92);
       System.out.println(a.gill);
       System.out.println(a.virat);

    }
   
}
class Q9
{
    Q9()
    {
        
    }
    int bumhra;
    int shami;
    Q9(int c, int d)
    {
        bumhra = c;
        shami = d;

    }
      void shreelanka()
    {
        Q9 a = new Q9(1,5);
        System.out.println(a.bumhra);
        System.out.println(a.shami);

    }

}
