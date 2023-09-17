// Java Program to print pattern
// Reverse Left Half Pyramid 
import java.util.*;
  
 class Reverse_Left_Half_Pyramid_Pattern
 {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
  
        // calculating number of spaces
        int num = 2 * n - 2;
  
        // outer loop to handle rows
        for (i = n; i > 0; i--) {
            // inner loop to print spaces.
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Decrementing value of num after each loop
            num = num - 2;
            // inner loop to print stars.
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
  
            // printing new line for each row
            System.out.println();
        }
    }
  
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}