// Write a program to enter a sentence from the keyboard and count the number of times a particular word occurs in it. Display the frequency of the search word.
// Example:
// INPUT:
// Enter a sentence : the quick brown fox jumps over the lazy dog.
// Enter a word to be searched : the
// OUTPUT :
// Searched word occurs : 2 times. [15]

import java.io.*;

class abc {
    public static void main(String args[]) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String str, word, wrd = "";
        char ch;
        int c = 0;
        System.out.println("Enter A sentence");
        str = br.readLine();
        str = str.trim();
        System.out.println("Enter a word to be searched");
        word = br.readLine();
        str = str + " ";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch != ' ') {
                wrd = wrd + ch;
            } else {
                if (word.equals(wrd)) {
                    c++;
                }
                wrd = "";
            }
        }
        System.out.println("searched word occurs" + c);
    }
}