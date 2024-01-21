package homework2;

public class mp1nagar {

    public static void main(String[] args) {
        zone1 p = new zone1();
        System.out.println(zone1.x);
        zone1.x = 90;
        System.out.println(p.y);

        
    }
    class indrapuri{
        int x = 80;
        void ct()
        {
            System.out.println("ct indrapuri");

        }
    }
    

}
class zone1{

    class SectorC{
        void ct1()
        {
            System.out.println("ct zone1");
        }

    }

    static int x = 78;
    int y = 90;//instance variable

}
