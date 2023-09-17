// In this section, we will learn what is a bouncy number and also create Java
// programs to check if the given number is bouncy. The bouncy number program
// frequently asked in Java coding tests and academics. Before understanding the
// bouncy number, first, we will understand what is increasing and decreasing
// numbers.

// Increasing Numbers
// In an integer traversing from left to right if the current digit is greater
// than or equal to the previous digit, the number is known as increasing
// numbers. In other words, we can say that if no digit is exceeded by the digit
// to its left is called increasing numbers. For example, 1233, 13689,
// 112334566, etc.

// Decreasing Numbers
// In an integer traversing from left to right if the current digit is less than
// the previous digit, the number is known as decreasing numbers. In other
// words, we can say that if no digit is exceeded by the digit to its right is
// called decreasing numbers. For example, 321, 88531, 8755321, etc.

// Bouncy Number
// A positive integer that is neither in increasing nor decreasing number is
// called a bouncy number. It means they bounce between increasing and
// decreasing. In other words, we can say that if the digits of the number are
// unsorted.

// For example, 123742, 101, 43682, etc. We observe that in the given number's
// digits are neither increasing nor decreasing if we traverse from left to
// right, hence they are called bouncy numbers.

import java.util.*;

class Bouncy_Number {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number you want to check: ");
        // reading an integer from the user
        int inputNumber = scan.nextInt();
        // if any of the following condition returns true, the number id not bouncy
        if (isIncreasing(inputNumber) || isDecreasing(inputNumber) || inputNumber < 101)
            // prints if the number is not bouncy
            System.out.println(inputNumber + " not a bouncy number.");
        else
            // prints if the number is bouncy
            System.out.println(inputNumber + " is a bouncy number.");
    }

    // function that checks if the number is an increasing number or not
    public static boolean isIncreasing(int inputNumber) {
        // converts the number into string
        String str = Integer.toString(inputNumber);
        char digit;
        // flag set to true
        boolean flag = true;
        // iterates over the string up to length-1
        for (int i = 0; i < str.length() - 1; i++) {
            digit = str.charAt(i);
            // if any digit is greater than check next digit, it will not check further
            if (digit > str.charAt(i + 1)) {
                // flag set to false if the condition returns true
                flag = false;
                break;
            }
        }
        return flag;
    }

    // function that checks if the number is a decreasing number or not
    public static boolean isDecreasing(int inputNumber) {
        // converts the number into string
        String str = Integer.toString(inputNumber);
        char digit;
        // flag set to true
        boolean flag = true;
        // iterates over the string up to length-1
        for (int i = 0; i < str.length() - 1; i++) {
            digit = str.charAt(i);
            // if any digit is less than the next digit, it will not check further
            if (digit < str.charAt(i + 1)) {
                // flag set to false if the condition returns true
                flag = false;
                break;
            }
        }
        return flag;
    }
}