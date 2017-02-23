/* Author : Elmira Amanollahi

In Netbeans create project RandArray.

Declare an array of integers 3 (rows) by 4 (columns).
Fill it in with random integers from 1-100 (inclusive).
Display the array in 3 lines, with values comma-separated.

EXTRA:
* Ask user how many rows and columns to allocate.
* Ask user for minimum and maximum values to randomly generate.



*/

package randarray;


import java.util.Random;
import java.util.Scanner;

public class RandArray {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows? ");
        int rowCount = input.nextInt();
        System.out.print("How many columns? ");
        int colCount = input.nextInt();
        System.out.print("Minimum? ");
        int minRand = input.nextInt();
        System.out.print("Maximum? ");
        int maxRand = input.nextInt();
        Random r = new Random();
        //
        int randArray [][] = new int[rowCount][colCount];
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                randArray[row][col] = r.nextInt(maxRand-minRand+1) + minRand;
            }
        }
        //
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                System.out.printf("%3d, ", randArray[row][col]); 
            }
            System.out.println();
        }
    }
}
