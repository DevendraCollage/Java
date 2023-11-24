
// todo: Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. The program should continue till user enters a word “quit”. Display the total count of each vowel for all sentences.
import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int E = 0;
        int I = 0;
        int O = 0;
        int U = 0;
        while (true) {
            System.out.print("Enter The Sentence Of 'Quit' to Exit : ");
            String sentence = sc.nextLine();
            if (sentence.equals("quit")) {
                break;
            } else {
                for (char c : sentence.toCharArray()) {
                    switch (c) {
                        case 'a':
                            A++;
                            break;
                        case 'e':
                            E++;
                            break;
                        case 'i':
                            I++;
                            break;
                        case 'o':
                            O++;
                            break;
                        case 'u':
                            U++;
                            break;
                    }
                }
            }
            System.out.println("The Vowel Count Of The Sentence Is!");
            System.out.println("A : " + A);
            System.out.println("E : " + E);
            System.out.println("I : " + I);
            System.out.println("O : " + O);
            System.out.println("U : " + U);
        }
        sc.close();
    }
}
