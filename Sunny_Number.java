// In this section, we will learn what is sunny numbers and how to create a Java
// program to find the sunny numbers. We will also create a Java program to find
// all the sunny numbers between the specified range.

// Sunny Number
// A number is called a sunny number if the number next to the given number is a
// perfect square. In other words, a number N will be a sunny number if N+1 is a
// perfect square.
// Suppose, we have to check if 80 is a sunny number or not.
// Given, N=80 then N+1 will be 80+1=81, which is a perfect square of the number
// 9. Hence 80 is a sunny number.
// Let's take another number 10.
// Given, N=10 then N+1 will be 10+1=11, which is not a perfect square. Hence 10
// is not a sunny number.

import java.util.*;

class Sunny_Number {
    // driver code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        // reading a number from the user
        int N = sc.nextInt();
        // calling user-defined function
        isSunnyNumber(N);
    }

    // function checks whether the given is a perfect square or not
    static boolean findPerfectSquare(double num) {
        // finds the square root of the ggiven number
        double square_root = Math.sqrt(num);
        // if square root is an integer
        return ((square_root - Math.floor(square_root)) == 0);
    }

    // function that checks whether the given number is Sunny or not
    static void isSunnyNumber(int N) {
        // checks N+1 is perfect square or not
        if (findPerfectSquare(N + 1)) {
            System.out.println("The given number is a sunny number.");
        }
        // executes if N+1 is not a perfect square
        else {
            System.out.println("The given number is not a sunny number.");
        }
    }
}