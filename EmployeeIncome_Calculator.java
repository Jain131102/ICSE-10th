// Define a class employee having the following description :
// Data members/instance variables:
// int pan — to store personal account number
// String name — to store name
// double tax income — to store annual taxable income
// double tax — to store tax that is calculated
// Member functions:
// input() — Store the pan number, name, taxable income
// calc() — Calculate tax for an employee
// display() — Output details of an employee
// Write a program to compute the tax according to the given conditions and
// display the output as per given format. [15]

// Total annual Taxable Income      Tax Rate
// Upto Rs. 1,00;000                 No tax
// From 1,00,001 to 1,50,000         10% of the income exceeding Rs. 1,00,000
// From 1,50,001 to 2,50,000         Rs. 5,000 + 20% of the income exceeding Rs.1,50,000
// Above Rs. 2,50,000                Rs. 25,000 + 30% of the income exceeding Rs. 2,50,000.

class EmployeeIncome_Calculator
{
int pan;
String name;
double taxincome, tax;
void input(int p, String n, Double income)
{
pan=p;
name=n;
taxincome=income;
}
void calc()
{
if(taxincome<=100000)
{
tax=0.0;
}
else if(taxincome<=150000)
{
tax=1*(taxincome-100000);
}
else if(taxincome<=250000)
{
tax=5000 + 2*(taxincome-150000);
}
else
{
tax=25000 + 3*(taxincome-250000);
}
}
void display()
{
System.out.println("Pan Number\tName\tTax-income\tTax");
System.out.println(pan+" \t"+name+" \t"+taxincome+"\t"+tax);
}
}
