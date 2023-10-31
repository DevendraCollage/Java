
// todo: Write a program to accept a line and check how many consonants and vowels are there in line.
import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String Here : ");
        String s = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // Check for all the character in the string
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels : " + vowels);
        System.out.print("Constants : " + consonants);
        sc.close();
    }
}