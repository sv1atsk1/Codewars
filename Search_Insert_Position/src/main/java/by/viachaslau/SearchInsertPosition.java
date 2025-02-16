package by.viachaslau;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of integers in the sorted array:");
            int count = scanner.nextInt();

            int[] nums = new int[count];
            System.out.println("Enter " + count + " sorted distinct numbers:");
            for (int i = 0; i < count; i++) {
                nums[i] = scanner.nextInt();
            }

            System.out.println("Enter the target value:");
            int target = scanner.nextInt();

            int result = searchInsert(Arrays.stream(nums).sorted().toArray(),target);
            System.out.println("The target should be at index: " + result);
        }
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}