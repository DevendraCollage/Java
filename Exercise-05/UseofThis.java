
// todo: Write a program in Java to demonstrate use of this keyword. Check whether this can access the Static variables of the class or not.
import java.util.Scanner;

class Sample {
    int no;
    String name;

    Sample(String name, int no) {
        this.name = name;
        this.no = no;
    }

    void display() {
        System.out.println("No : " + no);
        System.out.println("Name : " + name);
    }
}

public class UseofThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Any Number Here : ");
        int no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter The Any Name Here : ");
        String nm = sc.nextLine();
        Sample s = new Sample(nm, no);
        s.display();
        sc.close();
    }
}
