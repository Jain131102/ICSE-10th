// Buzz number is another special number in Java that ends with digit 7 or
// divisible by 7. Unlike Prime and Armstrong numbers, the Buzz number is not so
// popular and asked by the interviewers.

// In simple words, a number is said to be Buzz if it ends with 7 or is
// divisible by 7.

// Let's take some examples of Buzz numbers.

//import required classes and packages  

import java.io.*;   
import java.util.Scanner;  
  
class Buzz_Number {   
    
    // create checkNumber() method that returns true when it founds number Buzz   
    static boolean checkNumber(int number)   
    {   
        // check whether the number ends with 7, is divisible by 7 or not  
        if(number % 10 == 7 || number % 7 == 0)  
            return true;    //returns true when the number is Buzz  
        else  
            return false;   //returns flase when the number is not Buzz  
    }   
    
    // main() method start  
    public static void main(String args[])   
    {     
        int n1, n2;  
          
        //create scanner class object to get input from user  
        Scanner sc=new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter first number");  
          
        //store user entered value into variable n1  
        n1 = sc.nextInt();  
          
        //show custom message  
        System.out.println("Enter second number");  
          
        //store user entered value into variable n2  
        n2 = sc.nextInt();  
          
        if (checkNumber(n1))   
            System.out.println(n1 + " is a Buzz number");   
        else  
            System.out.println(n1 + " is not a Buzz number");   
        if (checkNumber(n2))   
            System.out.println(n2 + " is a Buzz number");   
        else  
            System.out.println(n2 + " is not a Buzz number");   
    }   
}   