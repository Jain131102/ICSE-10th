// Java Program to implement
// Pascal's Triangle
import java.util.*;
  
class Pascals_Triangle {
  
    // Pascal function
    public static void printPascal(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
  
                // for left spacing
                System.out.print(" ");
            }
  
            // used to represent x(i, k)
            int x = 1;
            for (int k = 1; k <= i; k++) {
  
                // The first value in a line is always 1
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }
  
    // Driver code
    public static void main(String[] args)
    {
        int n = 4;
        printPascal(n);
    }
}