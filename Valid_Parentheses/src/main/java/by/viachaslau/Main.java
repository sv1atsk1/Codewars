package by.viachaslau;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите строку: ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Выход из программы.");
                    break;
                }

                boolean result = isValidParentheses(input);
                if (result) {
                    System.out.println("Строка корректна.");
                } else {
                    System.out.println("Строка некорректна.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isValidParentheses(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}
