// todo: Declare a class called student having following data members:id_no, 
// no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi. 
// Define constructor and calculate_spi methods.Define main to instantiate an array 
// for objects of class student to process data of n students to be given as command 
// line arguments.

import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    int[] subject_code;
    int[] subject_credits;
    int[] grade_obtained;
    int total_weight = 0, total_credit = 0;
    double spi;

    Student(int a, int b, int[] c, int[] d, int[] e) {
        id_no = a;
        no_of_subjects_registered = b;
        subject_code = c;
        subject_credits = d;
        grade_obtained = e;
    }

    void calculate_spi() {
        for (int i = 0; i < no_of_subjects_registered; i++) {
            this.total_weight = total_weight + (subject_credits[i] * grade_obtained[i]);
            this.total_credit = total_credit + subject_credits[i];
        }
        spi = total_weight / total_credit;
        System.out.println("The Student Id Is : " + id_no + "\t\t\t" + "The Student Spi is : " + spi);
    }
}

public class Pro1 {
    public static void main(String[] args) {
        int sid, sub; // Subject, Subject_id;
        Scanner sc = new Scanner(System.in);
        int no = Integer.parseInt(args[0]); // Enter No of subject from the CLI (Command Line Arguments)
        Student[] st = new Student[no]; // CLI Value will store in this Array
        for (int i = 0; i < no; i++) {
            System.out.print("Enter Subject Id : ");
            sid = sc.nextInt();
            System.out.print("Enter No of Subjects : ");
            sub = sc.nextInt();

            int[] grade = new int[sub];
            int[] credit = new int[sub];
            int[] code = new int[sub];

            for (int j = 0; j < sub; j++) {
                System.out.print("Enter grade : ");
                grade[j] = sc.nextInt();
                System.out.print("Enter Credit : ");
                credit[j] = sc.nextInt();
                System.out.print("Enter Code : ");
                code[j] = sc.nextInt();
            }
            st[i] = new Student(sid, sub, code, credit, code);
        }
        for (Student student : st) {
            student.calculate_spi();
        }
        sc.close();
    }
}
