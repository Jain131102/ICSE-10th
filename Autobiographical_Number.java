// In this section, we will learn what is an autobiographical number and also
// create Java programs to check if the given number is autobiographical or not.
// The autobiographical number program frequently asked in Java coding tests to
// check the logic of the programmer.

// Autobiographical Number
// A digit count numerically précises the frequency of digits 0 through 9 in the
// order in which they occur in a number. In other words, a number that is a
// pompous and self-centered figure whose only purpose in life is to describe
// itself.

// We can define an autobiographical number formally as:

// An autobiographical number is a number (N) such that the first digit of N
// counts how many zeroes are presented in N, the second digit counts how many
// ones are presented in N, the third digit counts how many twos are presented
// in N, and so on. Sometimes, it is also known as a curious number. It is the
// sequence OEIS A046043.

// It is just like Self-describing primes that uses a different method OEIS
// A108810 to describe the Self-describing primes. The only difference between
// the two is that in autobiographical numbers digits are described in
// increasing order while self-describing primes digits can be described in any
// order.

// There is only a number 10213223 that describes itself. We observe that the
// frequency of 0 is 1, the frequency of 1 is 2, the frequency of 2 is 3, and
// the frequency of 3 is 2. Therefore, 10213223 is only a number that describes
// itself. The smallest autobiographical number is 1210.

import java.util.*;

class Autobiographical_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        // reading an integer from the user to check
        int num = sc.nextInt();
        // determines the absolute value of the given number
        num = Math.abs(num);
        // assigning the value of num into variable n
        int n = num;
        // the valueOf() method returns the string representation of int argument
        String str = String.valueOf(num);
        // creates an array of digits
        int digitarray[] = new int[str.length()];
        for (int i = digitarray.length - 1; i >= 0; i--) {
            // determines the last digit of the given number
            digitarray[i] = n % 10;
            // removes the last digit
            n = n / 10;
        }
        boolean flag = true;
        // an inner loop compares the iterator of the outer loop with each digit of the
        // inner loop //if they are equal then increment the occurrence count of the
        // digit
        for (int i = 0; i < digitarray.length; i++) {
            int count = 0;
            for (int j = 0; j < digitarray.length; j++) {
                if (i == digitarray[j])
                    // increments the count by 1 if the above condition returns true
                    count++;
            }
            if (count != digitarray[i]) {
                flag = false;
                // breaks the execution if the condition becomes true
                break;
            }
        }
        if (flag)
            // prints if the status returns true
            System.out.println(num + " is an autobiographical number.");
        else
            // prints if status returns false
            System.out.println(num + " is not an autobiographical number.");
    }
}