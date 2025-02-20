package by.viachaslau;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        generateSubsets(index + 1, nums, current, result);

        current.add(nums[index]);
        generateSubsets(index + 1, nums, current, result);

        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите элементы массива через пробел:");
            String[] input = scanner.nextLine().split(" ");
            int[] nums = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            System.out.println(subsets(nums));
        }
    }
}

