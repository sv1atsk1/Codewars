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
        int[] count = new int[3];
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                    count[0]++;
                    break;
                case ')':
                    count[0]--;
                    break;
                case '{':
                    count[1]++;
                    break;
                case '}':
                    count[1]--;
                    break;
                case '[':
                    count[2]++;
                    break;
                case ']':
                    count[2]--;
                    break;
            }
            for (int c : count) {
                if (c < 0) return false;
            }
        }
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
}
