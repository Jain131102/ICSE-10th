// In this section, we will learn what is a strontio number and also create Java
// programs to check if the given number is strontio. The strontio number
// program frequently asked in Java coding tests and academics.

// Strontio Number
// Strontio numbers are those four digits numbers when multiplied by 2 give the
// same digit at the hundreds and tens place. Remember that the input number
// must be a four-digit number.

// Strontio Number Example
// 1386*2=2772, we observe that at tens and hundreds place digits are the same.
// Hence, 1386 is a strontio number. 1221*2=2442, digits at tens and hundreds
// place are the same. Hence, 1221 is a strontio number.

// Some other strontio numbers are 1111, 2222, 3333, 4444, 5555, 6666, 7777,
// 8888, 9999, 1001, 2002, 3003, etc.

import java.util.*;

class Strontio_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        // reading an integer from the user
        int num = sc.nextInt();
        int n = num;
        // first, we have multiplied a number by 2
        // the resultant is divided by 1000 that gives the remainder and removes the
        // first digit
        // at last, the resultant is divided by 10 that removes the last digit
        // therefore, we get a two-digit number that are mean digits of the given number
        num = (num * 2 % 1000) / 10;
        // divide the two-digit number (that we get from the above) by 10 and find the
        // remainder
        // compares the remainder and quotient
        if (num % 10 == num / 10)
            // if equal, prints strontio number
            System.out.println(n + " is a strontio number.");
        else
            // prints if not a strontio number
            System.out.println(n + " is not a strontio number.");
    }
}