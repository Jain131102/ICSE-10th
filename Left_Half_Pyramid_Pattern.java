// Java Program to print pattern
// Left Half Pyramid pattern
import java.util.*;
  
 class Left_Half_Pyramid_Pattern
 {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
  
        // outer loop to handle rows
        for (i = n; i >= 1; i--) {
  
            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
  
            // inner loop to print stars.
            for (j = 0; j <= n - i; j++) {
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