// In this section, we will learn what is a mystery number and also create Java
// programs to check if the given number is a mystery number or not. The mystery
// number program frequently asked in Java coding tests and academics.
// A number N is said to be a mystery number if the number can be expressed by
// the sum of two numbers. Note that these two numbers must be reverse of each
// other. It lies between 22 to 198, i.e. 22<=N<=198.

// It is called mystery numbers because these are the multiples of 11, and the
// sum of place values of unit (1) and tens (10) place is 11 in decimal
// numeration.

// Sometimes, we get it in the form of a question, as follows:

// A number is split into two '2-digit' numbers in such a way that its unit and
// tens digits are interchanged. Find the mystery number?

// Let's understand it mathematically.

// Suppose, y is a unit digit and X is a tens digit. Then, the original number
// will be 10X+Y. After interchanging the place of the unit and tens digit, we
// get 10Y+X. Therefore, the mystery number will be:

// Mystery number= 10X+Y+10Y+X

// Solving the above equation, we get:

// 11X+11Y

// Take 11 as common. Hence, 11(X+Y).

// Here, X and Y can be replaced by any whole number such that and (as a
// condition is given in two-digit numbers).

import java.util.Scanner;  
 class Mystery_Number  
{  
//function that finds reverse of the given number  
static int reverse(int x)  
{  
//converts the given number into string      
String str = Integer.toString(x);  
//stores string  
String string="";  
for(int i=str.length()-1;i>=0;i--)  
{  
//stores the reverse of the string      
string=string+str.charAt(i);  
}  
//converts the string into integer  
int rev=Integer.parseInt(str);  
//returns the reverse number  
return rev;  
}  
//function that checks the number is mystery or not  
static boolean isMysteryNo(int num)  
{  
for (int i=1; i <= num/2; i++)  
{  
//calling the function that reverse a number and assign it to j  
int j = reverse(i);  
//compares the sum of two numbers is equal to given number or not  
if (i + j == num)  
{  
//prints a pair of numbers whose sum is the given number      
System.out.println( i + " " + j);  
System.out.println(num+ " is a mystery number.");  
//returns a boolean value if pair is found  
return true;  
}  
}  
System.out.println("The given number is not a mystery number.");  
//returns false if pair is not found  
return false;  
}  
//driver code  
public static void main(String args[])  
{  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a number: ");  
//reading an integer from the user  
int num = sc.nextInt();  
//calling the user-defined function to check the number is a mystery or not  
isMysteryNo(num);  
}  
}  