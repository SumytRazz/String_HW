import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string: ");
            String input = sc.next().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            int len = input.length();
            String original = input;
            String reverse = "";

            for (int i = len - 1; i >= 0; i--) {
                char element = input.charAt(i);
                reverse = reverse.concat(String.valueOf(element));
            }

            if (reverse.equals(original)) {
                System.out.println("It is a palindrome.");
            } else {
                System.out.println("It is not a palindrome.");
            }

            System.out.println("Type 'exit' to exit the program.");
        }
    }
}
