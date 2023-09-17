// ISBN is another special number in Java. ISBN stands for the International
// Standard Book Number that is carried by almost each every book. The ISBN is a
// ten-digit unique number. With the help of the ISBN, we can easily find any
// book. The ISBN number is a legal number when 1*Digit1 + 2*Digit2 + 3*Digit3 +
// 4*Digit4 + 5*Digit5 + 6*Digit6 + 7*Digit7 + 8*Digit8 + 9*Digit9 + 10*Digit10
// is divisible by 11. The digits are taken from right to left. So, if the
// ten-digit number is 7426985414, Digit1 and Digit10 will be 4 and 7,
// respectively.

import java.util.*;   
import java.io.*;   
import java.util.Scanner;  
  
class ISBN_Number {   
    
     static boolean checkISBNNumber(long number)  
    {  
            int sum = 0;  
    int i, t, intNumber, dNumber;  
    String strNumber;  
          
    strNumber = ""+number;  
          
    if (strNumber.length() != 10) {  
                    return false;  
            }  
          
            for (i = 0; i < strNumber.length(); i++) {  
                    intNumber = Integer.parseInt(strNumber.substring(i, i+1));  
                    dNumber = i + 1;  
                    t = dNumber * intNumber;  
                    sum = sum + t;  
            }  
  
            // check whether the sum is divisible by 11 or not  
        
            if ((sum % 11) == 0) {  
                    return true;  
            }  
          
    return false;  
          
    }  
    
    // main() method start  
    public static void main(String args[])   
    {     
long n1, n2;  
          
    try {  
              
        //create BufferedReader class object to get input from user  
        InputStreamReader in = new InputStreamReader(System.in);  
        BufferedReader br = new BufferedReader(in);  
          
        //show custom message  
        System.out.println("Enter first 10 digit ISBN number");  
              
        //store user entered value into variable n1  
        n1 = Long.parseLong(br.readLine());  
              
        //show custom message  
        System.out.println("Enter second 10 digit ISBN number");  
              
        //store user entered value into variable n2  
        n2 = Long.parseLong(br.readLine());  
              
        if (checkISBNNumber(n1))   
            System.out.println(n1 + " is a valid ISBN number");   
        else  
            System.out.println(n1 + " is not a valid ISBN number");   
        if (checkISBNNumber(n2))   
            System.out.println(n2 + " is a a valid ISBN number");   
        else  
            System.out.println(n2 + " is not a valid ISBN number");  
              
        }catch(java.lang.Exception e) {  
            System.out.println("Error while reading the data.");  
        }   
        }   
}  