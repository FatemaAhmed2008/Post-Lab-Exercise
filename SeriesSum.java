package versityworktask5;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, sum = 1,oddNumber = 1;
        
        // Input the number of terms
        
        System.out.print("Enter the number:");
         n =input.nextInt();
        
        // Loop to calculate the sum of the series
        
        for(int i = 1;i<=n;i++){
         
            // Add square of the odd number
            sum += oddNumber*oddNumber;
            
            // Get the next odd number
            oddNumber += 2;
 
             
        }
        
        // Output the result
        System.out.println("The sum of the series is:" + sum);
        
    }
    
}
