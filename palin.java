// Write a program using a method Palin(), to check whether a string is a
// Palindrome or not. A Palindrome is a string that reads the same from left to
// right and vice versa.
// E.g. MADAM, ARORA, ABBA, etc. [15]

import java.util.*;

class palin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int i, j = l - 1;
        int x = 0;
        for (i = 0; i < l / 2; i++) {
            if (s.charAt(i) != s.charAt(j)) {
                x = l;
                break;
            }
            j--;
        }
        if (x == 0) {
            System.out.println("The word is Palindrome");
        } else {
            System.out.println("The word is not Palindrome");
        }
    }
}