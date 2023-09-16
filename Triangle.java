// Write a program to generate a triangle or an inverted triangle till n terms
// based upon the user’s choice of triangle to be displayed.
// Example 1:
// Input : Type 1 for a triangle and
// Type 2,for an inverted triangle
// 1
// Enter the number of terms
// 5
// Output :
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

// Example 2:
// Input : Type 1 for a triangle and
// Type 2 for an inverted triangle
// 2
// Enter the number of terms
// 6
// Output :
// 6 6 6 6 6 6
// 5 5 5 5 5
// 4 4 4 4
// 3 3 3
// 2 2
// 1

import java.io.*;

class Triangle {
    public static void main(String args[]) throws IOException {
        InputStreamReader IR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(IR);
        int ch,n;
        System.out.println("Type 1 for a triangle and");
        System.out.println("Type 2 for an inverted triangle");
        ch = Integer.parseInt(br.readLine());
        System.out.println("Enter the number Of terms");
        n = Integer.parseInt(br.readLine());
        switch (ch) {
            case 1:
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
            break;
            case 2:
            for(int i=n;i>=1;i--)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
            break;
            default:
            System.out.println("Wrong Choice ");
        }
    }
}
