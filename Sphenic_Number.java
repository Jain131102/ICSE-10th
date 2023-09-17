// In this section, we will learn what is a sphenic number and also create Java
// programs to check if the given number is sphenic or not. The sphenic number
// program frequently asked in Java coding tests and academics.

// Sphenic Number
// A positive integer n is called a sphenic number if the product of factors of
// the given number (n) is exactly three and all factors are prime. In other
// words, if n is a sphenic integer then n=p x q x r (p, q, and are three
// distinct prime numbers and their product are n). It is a sequence A007304 in
// the OEIS. Let's understand it through an example.

// A number will be a sphenic number if the product of three distinct prime
// numbers gives the number itself. The sphenic numbers have exactly 8 divisors.

// Note: The product of the cube of a prime and another prime as well as seventh
// powers of primes also has 8 divisors.

// Some  sphenic numbers are 78, 102, 105, 110, 285, 286, 290, 310, 318, 322, 345, etc.

import java.util.*;

class Sphenic_Number {
    // create a global array of size 100000
    static boolean arr[] = new boolean[10000];

    // finds all the primes smaller than the limit
    static void findPrime() {
        // marks all entries as true
        // A value in mark[p] will finally be false if 'p' is Not a prime, else true.
        Arrays.fill(arr, true);
        // iterate over all the numbers so that their multiples can be marked as
        // composite
        for (int p = 2; p * p < 10000; p++) {
            // if p is not changed, then it is a prime
            if (arr[p]) {
                // update all the multiples of p
                for (int i = p * 2; i < 10000; i = i + p)
                    arr[i] = false;
            }
        }
    }

    // user-defined function that checks if the given number is sphenic or not
    static int isSphenic(int N) {
        // creating an array that stores the 8 divisors
        int[] arr1 = new int[8];
        // counts the divisors
        int count = 0;
        int j = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0 && count < 8) {
                // increments the count by 1
                count++;
                arr1[j++] = i;
            }
        }
        // checks that there is exactly 8 divisors or not and all the numbers are
        // distincit prime or not
        // if yes returns 1, else returns 0
        if (count == 8 && (arr[arr1[1]] && arr[arr1[2]] && arr[arr1[3]]))
            return 1;
        return 0;
    }

    // driver code
    public static void main(String args[]) {
        // calling user-defined function that find the priime numbers
        findPrime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        // reading an iteger from the user
        int n = sc.nextInt();
        int result = isSphenic(n);
        if (result == 1)
            // prints yes if the above condition returns true
            System.out.print("Yes, the given number is sphenic.");
        else
            // prints no if the above condition returns false
            System.out.print("No, the given number is not a sphenic.");
    }
}