package versityworktask5;

import java.util.Scanner;

public class SeriesEvaluation {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int sum =0;
        
        //Input  the number 
        System.out.print(" Enter the number:");
        int n = input.nextInt();
        
        // Loop through the series and calculation the sum
        for (int i = 1; i<= n ;i++){
             if (i % 2!= 0){
                 
                 // Add the odd number(1, 3, 5...)
                 sum += i ;
                 
             }else {
                 sum -= i; // Subtract the even number(2, 4, 6...)
                 
             }
            
        }
        
        // Output the result 
        System.out.println("The sum of the series is:"+ sum);
        
    }
    
}
