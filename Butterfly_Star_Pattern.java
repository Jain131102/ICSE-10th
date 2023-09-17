// Java Program to print
// Butterfly Pattern
import java.util.*;
  
// Java code for printing pattern
public class Butterfly_Star_Pattern {
  
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
  
        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
  
            // inner loop to print spaces
            int spaces = 2 * (n - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
  
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
  
            System.out.println();
        }
  
        // outer loop to handle lower part
        for (i = n; i >= 1; i--) {
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
  
            // inner loop to print spaces
            int spaces = 2 * (n - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
  
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
  
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