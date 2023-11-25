// WAP using class Person to display name and age
class Person {
    String name;
    int age;
}

public class DemoofClass {
    public static void main(String[] args) {
        // Create object of Person class and allocates property memory
        Person p = new Person();
        p.name = "Devendra";
        p.age = 22;
        System.out.println("Your Name Is : " + p.name);
        System.out.println("Your Age Is : " + p.age);
    }
}