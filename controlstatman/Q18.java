package controlstatman;

public class Q18 {
    public static void main(String[] args) {
        float a = 50f;
        float b = 55f;
        float profit = a - b;
        float loss = b - a;
        if(a>b){
            System.out.println(profit  + " is profit");
        }
            else if(a<b){
                System.out.println(loss + "is loss");

            }
            else{
                System.out.println("Nothing");
            }
           // String p = (a>b)?(profit  + " is profit"):(a<b?loss + "is loss":"Nothing");
            //System.out.println(p);
        }
    }

