// An electronics shop has announced the following seasonal discounts on the
// purchase of certain items.

// Purchase Amount in Rs.       Discount on Laptop      Discount on Desktop PC
// 0—25000                           0.0%                    5.0%
// 25001—57000                       5.0%                    7.5%
// 57001—100000                      7.5%                    10.0%
// More than 100000                  10.0%                   15.0%
// Write a program based on the above criteria, to input name, address, amount
// of purchase and the type of purchase (L for Laptop and D for Desktop) by a
// customer. Compute and print the net amount to be paid by a customer along
// with his name and address.
// (Hint : discount = (discount rate/100)* amount of purchase Net amount =
// amount of purchase – discount) [15]

import java.util.*;

class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, add;
        double amt, disc = 0.0;
        char ch;

        System.out.print("Name=");
        name = sc.next();
        System.out.print("Address=");
        add = sc.next();
        System.out.print("Amount of purchase=");
        amt = sc.nextDouble();
        System.out.print("Type of Purchase L/D=");
        ch = sc.next().charAt(0);

        switch (ch) {
            case 'L':
                if (amt <= 25000)
                    disc = 0.0;
                else if (amt >= 25001 && amt <= 57000)
                    disc = (5.0 / 100) * amt;
                else if (amt >= 57001 && amt <= 100000)
                    disc = (7.5 / 100) * amt;
                else
                    disc = (10.0 / 100) * amt;
                break;
            case 'D':
                if (amt <= 25000)
                    disc = (5.0 / 100) * amt;
                else if (amt >= 25001 && amt <= 57000)
                    disc = (7.5 / 100) * amt;
                else if (amt >= 57001 && amt <= 100000)
                    disc = (10.0 / 100) * amt;
                else
                    disc = (15.0 / 100) * amt;
                break;
        }

        double namt = amt - disc;
        System.out.println("Customer Name:" + name);
        System.out.println("Customer Address:" + add);
        System.out.println("Net Amount To Be Paid:" + namt);
    }
}