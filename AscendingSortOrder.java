package versityworktask5;

import java.util.Scanner;

public class AscendingSortOrder {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        // Input the number of elements
        System.out.print("Enter the number:");
        int n = Scanner.nextInt();
        
        // Create an array to store the number
        int[] numbers = new int[n];
        
        // Input the numbers
        System.out.print("Enter the numbers:");
        
        for(int i =0; i < n ;i++){
            numbers[i] = Scanner.nextInt();
            
        }
        
        // Bubble sort algorithm
        for(int i = 0; i < n-1;i++){
            for(int j = 0; j < n - i - 1;j++){
                if(numbers[j]>numbers[j + 1] ){
                    
                    // Sawp the elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        
        // Output the result
        System.out.println( "Sorted numbers in ascending order: ");
        
        for(int i = 0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }
        
    }
    
}
