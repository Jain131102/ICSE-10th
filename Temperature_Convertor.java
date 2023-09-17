// Using a switch statement, write a menu driven program to convert a given
// temperature from Fahrenheit to Celsius and vice versa. For an incorrect
// choice, an appropriate error message should be displayed.
// HINT : C =(5/9)× (F – 32) and F = 1.8 × (C + 32) [15]

import java.io.*;

class Temperature_Convertor {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        double f = 0, c = 0;
        System.out.println("Menu");
        System.out.println("1.Fahrenheit to Celsius");
        System.out.println("2.Celsius to Fahrenheit");
        System.out.println("3.Wrong choice.Re-enter");
        System.out.println("Enter your choice(l-3):");
        choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Enter the value of Fahrenheit");
                f = Double.parseDouble(br.readLine());
                c = 5 / 9 * (f - 32);
                System.out.println("Temperature Fahrenheit to Celsius =" + c);
                break;
            case 2:
                System.out.println("Enter the value of Celsius");
                c = Double.parseDouble(br.readLine());
                f = 1.8 * (c + 32);
                System.out.println("Celsius to Fahrenheit =" + f);
                break;
            default:
                System.out.println("Wrong choice! Re-enter");
                break;
        }
    }
}
