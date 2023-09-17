// In this section, we will learn what is a fascinating number and also create
// Java programs to check if the given number is fascinating or not. The
// fascinating number program is frequently asked in Java coding tests.

// Fascinating Numbers
// Multiplying a number by two and three separately, the number obtained by
// writing the results obtained with the given number will be called a
// fascinating number. If the result obtained after concatenation contains all
// digits from 1 to 9, exactly once.

// In other words, we can also say that a number (n) may be a fascinating number
// if it satisfies the following two conditions:

// If the given number is a 3 or more than three-digit
// If the value getting after concatenation contains all digits from 1 to 9,
// exactly once.
// For example, 192, 1920, 2019, 327, etc.

import java.util.*;

class Fascinating_Number {
    public static void main(String args[]) {
        int num, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        num = sc.nextInt();
        n2 = num * 2;
        n3 = num * 3;
        // concatenating num, n2, and n3
        String concatstr = num + "" + n2 + n3;
        boolean found = true;
        // checks all digits from 1 to 9 are present or not
        for (char c = '1'; c <= '9'; c++) {
            int count = 0;
            // loop counts the frequency of each digit
            for (int i = 0; i < concatstr.length(); i++) {
                char ch = concatstr.charAt(i);
                // compares the character of concatstr with i
                if (ch == c)
                    // incerments the count by 1 if the specified condition returns true
                    count++;
            }
            // returns true if any of the condition returns true
            if (count > 1 || count == 0) {
                found = false;
                break;
            }
        }
        if (found)
            System.out.println(num + " is a fascinating number.");
        else
            System.out.println(num + " is not a fascinating number.");
    }
}