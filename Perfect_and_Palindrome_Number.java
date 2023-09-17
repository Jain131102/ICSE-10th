// Write a menu driven class to accept a number from the user and check whether
// it is a Palindrome or a Perfect number.
// (a) Palindrome number— (a number is a Palindrome which when read in reverse
// order is same as read in the right order)
// Example : 11, 101, 151 etc.
// (b) Perfect number— (a number is called Perfect if it is equal to the sum of
// its factors other than the number itself.) Example : 6 = 1 + 2 + 3 [15]

import java.io.*;

class Perfect_and_Palindrome_Number {
    public static void main(String args[]) throws IOException {
        InputStreamReader IR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(IR);
        System.out.println("Press 1 for Palindrome Number");
        System.out.println("Press 2 for Perfect Number");
        System.out.println("Enter your choice");
        int ch = Integer.parseInt(br.readLine());
        int num1, num2;
        switch (ch) {
            case 1:
                System.out.println("Enter the Number :");
                num1 = Integer.parseInt(br.readLine());
                int rev = 0;
                int x = num1; // duplicate copy
                while (x != 0) {
                    rev = rev * 10 + x % 10;
                    x = x / 10;
                }
                if (rev == num1) {
                    System.out.println("The number is Palindrome");
                } else {
                    System.out.println("The Number is Not Palindrome");
                }
                break;
            case 2:
                System.out.print("Enter the Number :");
                num2 = Integer.parseInt(br.readLine());
                int sum = 0;
                for (int i = 1; i < num2; i++) {
                    if (num2 % i == 0) {
                        sum = sum + i;
                    }
                }
                if (sum == num2) {
                    System.out.println("The Number is Perfect Number");
                } else {
                    System.out.println("Tbe Number is Not a Perfect Number");
                }
                break;
            default:
                System.out.println("Wrong Choice! Run the program again");
                break;
        }
    }
}
