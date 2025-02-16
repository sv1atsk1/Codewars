package by.viachaslau;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of integers you want to add to the array:");
            int count = scanner.nextInt();

            int[] nums = new int[count];
            System.out.println("Enter " + count + " numbers:");
            for (int i = 0; i < count; i++) {
                nums[i] = scanner.nextInt();
            }

            boolean result = containsDuplicate(nums);
            System.out.println(result);
        }
    }

    public static boolean containsDuplicate(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : array) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}