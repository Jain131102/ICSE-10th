// Write a program to compute and display the sum of the following series:
// (1+2)/(lx2)+(1+2+3)/(lx2x3).... upto n terms 

import java.io.*;

class series {
    public static void main() throws IOException {
        InputStreamReader IR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(IR);
        int num;
        System.out.print("Enter the Limit of Series:");
        num = Integer.parseInt(br.readLine());
        double s = 0;
        double n = 1;
        double d = 1;
        for (int i = 2; i <= num; i++) {
            n = n + i;
            d = d * i;
            s = s + n / d;
        }
        System.out.println("The Sum =" + s);
    }
}