// Define a class salary described as below :
// Data Members: Name, Address, Phone, Subject Specialisation, Monthly Salary, Income Tax.
// Member methods:
// (i) To accept the details of a teacher including the monthly salary.
// (ii) To display the details of the teacher.
// (iii) To compute the annual Income Tax as 5% of the annual salary above Rs. 1,75,000/-.
// Write a main method to create object of a class and call the above member method. [15]

import java.io.*;

class salary {
    String name, address, phone, subject;
    double salary, it;

    void get(String na, String add, String ph, String sub, double sal) {
        name = na;
        address = add;
        phone = ph;
        subject = sub;
        salary = sal;
    }

    void display() {
        System.out.println("Name=" + name);
        System.out.println("Address=" + address);
        System.out.println("Phone Number =" + phone);
        System.out.println("Subject Specialization =" + subject);
        System.out.println("Monthly Salary=" + salary);
        System.out.println("Income Tax=" + it);
    }

    void compute() {
        if ((salary * 12) > 175000)
            it = 0.05 * (salary * 12);
        else
            it = 0;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader IR = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(IR);
        salary obj = new salary();
        String na, add, ph, sb;
        double sal;
        System.out.print("Enter the name");
        na = br.readLine();
        System.out.print("Enter the Address");
        add = br.readLine();
        System.out.print("Enter the Phone Number");
        ph = br.readLine();
        System.out.print("Enter the Subject Specialization");
        sb = br.readLine();
        System.out.print("Enter the Monthly Salary");
        sal = Double.parseDouble(br.readLine());
        obj.get(na, add, ph, sb, sal);
        obj.compute();
        obj.display();
    }
}