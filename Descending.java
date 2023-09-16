// Write a program to input forty words in an array. Arrange these words in descending order of alphabets, using selection sort technique. Print the sorted array. [15]

import java.util.Scanner;
class Descending {
public static void main(String args[ ]) {
int n;
String temp;
Scanner s = new Scanner(System.in);
System.out.print("Enter number of words you want to enter:");
n = s.nextInt( );
String names[ ] = new String[n];
Scanner s1 = new Scanner(System.in);
System.out.println("Enter all words:");
for(int i = 0; i < n; i++) {
names[i] = s1.nextLine( );
}
for (int i = 0; i < n; i++){
for (int j = i + 1; j < n;j++){
if (names[i].compareTo(names[j]) < 0) {
temp = names [i];
names[i] = names[j];
names[j] = temp;
}
}
}
System.out.print("Words in Descending Order:");
for (int i = 0;i<n-1;i++){
System.out.print(names[i] + ",");
}
System.out.print(names[n - 1]);
}
}