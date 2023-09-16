// A tech number has even number of digits. If the number is split in two equal
// halves, then the square of sum of these halves is equal to the number itself.
// Write a program to generate and print all four digit tech numbers. [15]
// Example :
// Consider the number 3025
// Square of sum of the halves of 3025 = (30+25)2
// = (55)2
// = 3025 is a tech number.

class TechNumber {
    public static void main(String args[]) {
        int i, a, b, sum;
        String n;
        System.out.println("Four Digits Tech Numbers are::");
        for (i = 1000; i <= 9999; i++) {
            n = i + "";
            a = Integer.parseInt(n.substring(0, 2));
            b = Integer.parseInt(n.substring(2));
            sum = (int) Math.pow((a + b), 2);
            if (sum == i)
                System.out.println(i);
        }
    }
}