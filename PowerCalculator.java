package versityworktask5;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        
        // Create a scanner object for input 
        Scanner Scanner = new Scanner(System.in);
        
        // Input the base and exponent
        System.out.print("Enter the base:");
        double base = Scanner.nextDouble();
        
        System.out.print("Enter the exponent:");
        int exponent = Scanner.nextInt();
        
        // Calculate power using Math.pow()method
        double result = Math. pow(base,exponent);
        
        // Output the result 
        System.out.println(base+"raised to the power of " + exponent + " is "+ result);
     
        // Close the Scanner
        Scanner.close();
    }
    
}
