// Write a program to input a sentence and print the number of characters found
// in the longest word of the given sentence.
// For example, if S=“India is my country” then the output should be 7. [15]

import java.util.*;
class Longest_Word
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        String wrd="";
        int l;
        int max =0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch!=' '){
                wrd=wrd+ch;
            }
            else
            {
                l=wrd.length();
                if(l>max)
                max=l;
            }
        }
System.out.println("Longest word is "+max+" characters long");
    }
}
