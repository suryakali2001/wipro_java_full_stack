import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

      
        String reversed = new StringBuilder(cleanedInput).reverse().toString();

      
        if (cleanedInput.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
