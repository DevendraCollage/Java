
// todo: Write a program to accept a line and check how many consonants and vowels are there in line.
import java.util.Scanner;

public class VowelsandConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String Here : ");
        String str = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("The Vowels In The String Is : " + vowels);
        System.out.println("The Consonants In The String Is : " + consonants);
        sc.close();
    }
}
