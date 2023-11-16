
/*
 * In a company an employee is paid as under:
 * If his basic salary is less than Rs. 1500, then HRA=10% of basic salary and 
 * DA=90% of basic salary.
 * If his basic salary is either equal to or above Rs.1500, then HRA=Rs.500 and 
 * DA=98% of basic salary.
 * Employee's salary is input through the keyboard, write a program to find his 
 * gross salary.
 */
import java.util.Scanner;

public class Basic_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Basic Salary Here : ");
        float salary = sc.nextFloat();
        if (salary < 1500) {
            salary = (float) (salary + (salary * 0.10)); // HRA=10%
            float DA = (float) (salary + salary * 0.90); // DA=90%
            double AllSalary = salary + DA;
            System.out.println(AllSalary + " Is your Gross Salary!");
        } else if (salary >= 1500) {
            salary = salary + 500; // HRA=Rs.500
            double DA = salary + salary * 0.98; // DA=98%
            double AllSalary = salary + DA;
            System.out.println(AllSalary + " Is your Gross Salary!");
        } else {
            System.out.println("Your Salary Is Grater!");
        }
        sc.close();
    }
}
