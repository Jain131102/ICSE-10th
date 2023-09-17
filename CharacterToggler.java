// Write a program to input a string and print out the text with the uppercase
// and lowercase letters reversed, but all other characters should remain the
// same as before.
// Example:
// INPUT : WelComE TO School
// OUTPUT : wELcOMe to SCHOOL [15]

import java.util.*;

class CharacterToggler {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string :");
        String s = sc.nextLine();
        int len = s.length();
        String s1 = "";// second string
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                s1 = s1 + Character.toLowerCase(ch);
            } else if (Character.isLowerCase(s.charAt(i))) {
                s1 = s1 + Character.toUpperCase(ch);
            } else {
                s1 = s1 + s.charAt(i);
            }
        }
        s = s1;
        System.out.println(s);
    }
}
