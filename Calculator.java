
import java.util.Scanner;
    
public class Calculator {
       
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        int num1, num2 ;
        double result;
        
        System.out.println("Enter value of Num1: ");
        num1 = input.nextInt();
        System.out.println("Enter Value of Num2: ");
        num2 = input.nextInt();
        
        result = num1 + num2 ; 
        System.out.println("The Sum is: " +result);
        
        result = num1 - num2 ;
        System.out.println("The Difference is: " +result);
        
        result = num1 * num2 ;
        System.out.println("The Product is: " +result);
        
        result = num1 / num2 ;
        System.out.println("The Quotient is: " +result);
        
        result = num1 % num2 ;
        System.out.println("The Modulus value: " +result);
        
        result++ ;
        System.out.println("The Increment value is: " +result);
        
        result-- ;
        System.out.println("The Decrement value is: " +result);
        
    }


}

