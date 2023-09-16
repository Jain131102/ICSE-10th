// Write a menu driven program to display the pattern as per user's choice. [15]
// Pattern 1 Pattern 2
// ABCDE B
// ABCD LL
// ABC UUU
// AB EEEE
// A
// For an incorrect option, an appropriate error message should be displayed.

import java.util.Scanner;

class Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("::::MENU::::");
        System.out.println(" 1. To display ABCD Pattern");
        System.out.print(" 2. To display Word Pattern");
        System.out.print("Enter your choice:");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                for (char i = 'E'; i >= 'A'; i--) {
                    for (char j = 'A'; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;
            case 2:
                String S = "BLUE";
                for (int i = 0; i < S.length(); i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(S.charAt(i));
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}