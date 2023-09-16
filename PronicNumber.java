// Write a program to input a number and check and print whether it is a Pronic
// number [15] or not. (Pronic number is the number which is the product of two
// consecutive integers)
// Examples : 12 = 3 × 4 .
// 20 = 4 × 5
// 42 = 6 × 7

import java.util.Scanner;

class PronicNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int i = 0;
        while (i * (i + 1) < n) {
            i++;
        }
        if (i * (i + 1) == n) {
            System.out.println(n + " is a Pronic Number.");
        } else {
            System.out.println(n + " is not a Pronic Number.");
        }
    }
}
