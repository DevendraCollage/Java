// todo: Write an application that searches through its command-line argument. If an argument is found that does not begin with and upper case letter, display error message and terminate.
public class CLIArgumentsCheck {
    public static void main(String[] args) {
        String st = args[0]; // todo: This will get the String from the CLI
        if (st == null || Character.isUpperCase(st.charAt(0))) {
            System.out.println("Error: Argument Starts with an Uppercase Letter!");
        } else {
            System.out.println(args[0]);
        }
    }
}
