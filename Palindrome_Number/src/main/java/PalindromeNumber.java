import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        isPalindrome();
    }
    public static void isPalindrome() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number for palindrome check");
            while (scanner.hasNextInt()) {
                int checkForPalindrome = scanner.nextInt();
                if (isPalindromeNumber(checkForPalindrome)) {
                    System.out.println("The number is palindrome");
                } else {
                    System.out.println("The number isn't a palindrome");
                }
            }
        }
    }
    public static boolean isPalindromeNumber(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }
}
