// Write a program to accept a number and check and display whether it is a spy number or not. (A number is spy if the sum of its digits equals the product of its digits.) [15]
// Example : consider the number 1124,
// Sum of the digits = 1 + 1+ 2 + 4 = 8
// Product of the digits = 1×1x2x4 = 8

import java.util.*;
class SpyNumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        int sum = 0;
        int multiple = 1;
        int a;
        int p = n;
        // a stores each digit extracted and p creates a backup of input.
        while (n != 0) {
            a = n % 10;
            sum = sum + a;
            multiple = multiple * a;
            n = n / 10;
        }
        System.out.println("The sum of " + p + " is " + sum);
        System.out.println("The product of " + p + " is " + multiple);
        if (sum == multiple) {
            System.out.println("Aha, " + p + " It is a Spy Number Where Sum = Product");
        } else {
            System.out.println(" It is NOT a Spy Number Where Sum not equal to  Product");
        }
    }
}