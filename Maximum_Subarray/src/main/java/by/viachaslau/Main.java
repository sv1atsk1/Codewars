package by.viachaslau;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите количество элементов массива: ");
            int n = scanner.nextInt();
            int[] nums = new int[n];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            System.out.println("Максимальная сумма подмассива: " + maxSubArray(nums));
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }

    public static int maxSubArray(int[] array) {
        int maxSum = array[0];
        int currentSum = array[0];

        for (int i = 0; i < array.length; i++) {
            currentSum = Math.max(array[i], currentSum + array[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}