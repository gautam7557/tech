public class test {
    public static void main(String[] args) {
      A d= new A();
      A.C h = d.new C();
        A v= new A();
        d.j = 89;
        System.out.println(d.j);
        D k = new D();
        System.out.println(k.D);
        D.E m = k.new E();
        D.E.j n = m.new j();
        V l = new V();
        System.out.println(l.g);


    
    
        
    }
    
}
class A 
{
    int j = 90;
    class C{
         double gautam()
        {
            int h = 67;
            System.out.println(h);
            //gautam();
            return 90.9;
        }

    }

}
class D {
    float D = 90.9f;
    class E{
        class j {
            double j = 80.6;
        }


    }
    
}
class V {

    int g = 65;

}
