
package randarray;

/**
 *
 * @author Elmira
 * Declare an array of integers 3 (rows) by 4 columns fill it in with random integers
 * from 1-100 (inclusive) 
 * display the array in 3 lines , with values comma-separated
 * 
 * Extra: Ask user how many rows and columns to allocate,
 * ask user for minimum and MAXIMUM VALUES to randomly generate 
 */


import java.util.Random;
import java.util.Scanner;
public class RandArray {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("how many rows? ");
        int rowCount = input.nextInt();
       
        
        System.out.println("how many columns? ");
        int colCount= input.nextInt();
       
        
        System.out.println("Minimum value?");
         int minRand = input.nextInt();
         
         
         System.out.println("Maximum value?");
         int maxRand = input.nextInt();
         
         Random r  = new Random();
        
        
        
        int[][] myInt = new int[rowCount][colCount];
        
        for (int row = 0; row < myInt.length; row++) {
             for (int col = 0; col < myInt.length; col++){
             myInt[row][col] = r.nextInt(maxRand- minRand + 1) + minRand;
                 System.out.println(myInt[row][col] + ',');
          
            }
        }
       
        System.out.println();
        
        for (int row = 0; row < myInt.length; row++) {
             for (int col = 0; col < myInt.length; col++){
             myInt[row][col] = (int) (Math.random() * 100) + 1;
                 System.out.println(myInt[row][col] + ',');
          
            }
        }
        
    }
    
}
