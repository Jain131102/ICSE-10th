// Write a program in Java to accept a string in lower case and change the first letter of every word to upper case. Display the new string. [15]
// Sample input: we are in cyber world
// Sample output : We Are In Cyber World

import java.util.*;

class ChangeLetter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String in lowercase:");
        String str = sc.nextLine();
        String temp = (str.charAt(0) + "").toUpperCase();
        int k=0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                temp = temp +" "+(str.charAt(i + 1) + "").toUpperCase();
                 i++;
            }
            else
                temp = temp + str.charAt(i);
        }
        System.out.println(temp);
    }
}
