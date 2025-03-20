package versityworktask5;

import java.util.Scanner;

public class ConvertTemperatureFarnToCels {
    public static void main(String[] args) {
        
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        double cels,farn;
        
        // Take the user to enter temperature in fahrenheit
        
        System.out.print("Enter a degree in farn = ");
        farn = input. nextDouble();
        
        // Convert fahrenheit to celsius
        
        cels = (farn - 32) * 5/9;
        
        // Display the result
        
        System.out.println(" celsius "+ cels);
        
       
    }
    
}
