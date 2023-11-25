// WAP using class Person to display name and age with method
class Person {
    String name;
    int age;

    public void DisplayName() {
        System.out.println("You Name Is : " + name);
        System.out.println("You Age Is : " + age);
    }
}

public class DemoofMethod {
    public static void main(String[] args) {
        // Create object of the Person Class
        Person p = new Person();
        p.name = "Devendra";
        p.age = 22;
        p.DisplayName();
    }
}
