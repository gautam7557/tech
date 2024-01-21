package controlstatman;

public class Q39 {
    public static void main(String[] args) {
        char operator = 'd';
        
        System.out.println("Enter the First Operand : ");
        double first = 5876;
        
        System.out.println("Enter the Second Operand : ");
        double second = 56987;
        
        double result = 0;
        
        switch('*'){
        case '+':
            result = first + second;
            break;
        case '-':
            result = first - second;
            break;
        case '*':
            result = first * second;
            break;
        case '/':
            result = first / second;
            break;
        }
        
        System.out.println("The Result is : \n "+first+" "+operator+" "+second+" = "+result);
        
    }
    
    }
