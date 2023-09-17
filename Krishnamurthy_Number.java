// Krishnamurthy number is another special number in Java. A number is said to
// be Krishnamurthy if the factorial sum of all its digits is equal to that
// number. Krishnamurthy number is also referred to as a Strong number. Just
// like Prime and Armstrong numbers, Krishnamurthy number is also frequently
// asked by the interviewers but with it's another name, i.e., Strong number.

import java.io.*;   
import java.util.Scanner;  
  
class Krishnamurthy_Number {   
      
    // create fact() method to calculate the factorial of the number   
    static int fact(int number)   
    {   
        int f = 1;   
        while (number != 0) {   
            f = f * number;   
            number--;   
        }   
        return f;   
    }   
  
    // create checkNumber() method that returns true when it founds number krishnamurthy   
    static boolean checkNumber(int number)   
    {   
        int sum = 0;    //initialize sum to 0   
          
        int tempNumber = number;    //create a copy of the original number   
          
        //perform operation until tempNumber will not equal to 0  
        while (tempNumber != 0) {   
            // calculate the factorial of the last digit of the tempNumber and then add it to the sum  
            sum = sum + fact(tempNumber % 10);   
  
            // replace the value of tempNumber by tempNumber/10   
            tempNumber = tempNumber / 10;   
        }   
  
        // Check whether the number is equal to the sum or not. If both are equal, number is krishnamurthy number  
        if(sum == number)  
            return true;  
        else  
            return false;  
    }   
  
    // main() method start  
    public static void main(String[] args)   
    {   
        int n;  //initialize variable n  
          
        //create scanner class object to read data from user  
        Scanner sc = new Scanner(System.in);  
          
        //custom message  
        System.out.println("Enter any number:");  
          
        //store user entered value into variable n  
        n = sc.nextInt();  
         
        if (checkNumber(n))   
            System.out.println(n + " is a krishnamurthy number");   
        else  
            System.out.println(n + "is not a krishnamurthy number");   
    }   
}  