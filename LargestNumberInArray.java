package versityworktask5;
import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String[] args) {
        
        // Create a scanner object to take user input
        Scanner Scanner = new Scanner(System.in);
        
        // Ask the user how many numbers they  want to input 
        System.out.print("Enter the number :");
        int n = Scanner .nextInt();
        
        // Initialize the array
        int[] numbers = new int[n];
       
        // Take input for the aaray element
        System.out.print("Enter the number: ");
        
        for(int i = 0; i<n; i++){
            numbers[i] = Scanner.nextInt();
        }
        
        // Initialize largest to the first element
        int largest = numbers[0];
        
        // Loop through the array to find the largest number
        
        for(int num:numbers){
        if(num > largest){
            
            largest = num;
            
        }
        
    }
        
        // Print the largest number
        System.out.println("The largest number is: " + largest);
        
    }
    
}
