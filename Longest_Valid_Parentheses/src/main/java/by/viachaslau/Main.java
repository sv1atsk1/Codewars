package by.viachaslau;

import java.util.Scanner;
import java.util.Stack;

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

                int result = longestValidParentheses(input);
                System.out.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int longestValidParentheses(String string) {
        Stack<Integer> stack = new Stack<>();
        int maxLength = 0;
        stack.push(-1);

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
            }
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                maxLength = Math.max(maxLength, i - stack.peek());
            }
        }
        return maxLength;
    }
}