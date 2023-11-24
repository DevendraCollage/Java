
/*
 * Create a class named 'Member' having the following members:
1-Name
2-Age
3-Phone number
4-Address
5-Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and Manager' inherits the 'Member' class. The 'Employee' and 
'Manager' classes have data members 'specialization' and 'department' respectively. 
Now assign name, age, phone number address and salary to an employee and a manager by 
making an object of both of these classes and print the same along with specialization 
and department respectively.
 */

class Member {
    String name;
    int age;
    String phone_number;
    String address;
    double salary;

    // Constructor to initialize member
    Member(String name, int age, String phone_number, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("The Salary is : " + salary);
    }
}

class Employee extends Member {
    String specialization;

    // Constructor to initialize employee member
    Employee(String name, int age, String phone_number, String address, double salary, String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    // Constructor to initialize manager member
    Manager(String name, int age, String phone_number, String address, double salary, String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }
}

public class Pro3 {
    public static void main(String[] args) {
        Employee e = new Employee("Devendra", 22, "111222444", "India", 45000, "Software");
        Manager m = new Manager("Divin", 22, "111222555", "India", 45000, "IT");

        // Print Details of Employee
        System.out.println("Employee Details:");
        System.out.println("Name: " + e.name);
        System.out.println("Age: " + e.age);
        System.out.println("Phone Number: " + e.phone_number);
        System.out.println("Address: " + e.address);
        e.printSalary(); // Calling the method from the base class
        System.out.println("Specialization: " + e.specialization);
        System.out.println();

        // Assign the Manager members
        System.out.println("Manager Details:");
        System.out.println("Name: " + m.name);
        System.out.println("Age: " + m.age);
        System.out.println("Phone Number: " + m.phone_number);
        System.out.println("Address: " + m.address);
        m.printSalary(); // Calling the method from the base class
        System.out.println("Department: " + m.department);
    }
}
