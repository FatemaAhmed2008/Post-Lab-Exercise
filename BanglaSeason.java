package versityworktask5;

import java.util.Scanner;

public class BanglaSeason {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        // Input month number
        System.out.print("Enter the month number(1-12):");
        int month = Scanner.nextInt();
        
        // Using if statement to determine the season
        
        String season ="";
        
        if ( month == 1 || month == 2){
            season = "Summer";
            
        }else if( month == 3 || month == 4){
            season = "Rainy";
            
        }else if( month == 5 || month == 6){
        season = "Autumn";
        
        }else if( month == 7 || month == 8){
            season = "Pre-Winter";
            
        }else if( month == 9 || month == 10){
            season = "Winter";
            
        }else if ( month == 11 || month == 12){
            season = "Spring";
            
        }else{ 
           season =  "Invalid month!please enter a number between 1 and 12";
          
        }
        
        System.out.println("The season is :" + season);
    }
    
}
