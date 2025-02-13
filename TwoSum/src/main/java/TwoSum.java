import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the target for search");
            int target = scanner.nextInt();
            System.out.println("Enter the number of integers you want to add to the array:");
            int count = scanner.nextInt();

            int[] nums = new int[count];
            System.out.println("Enter " + count + " numbers:");
            for (int i = 0; i < count; i++) {
                nums[i] = scanner.nextInt();
            }

            int[] result = twoSum(nums, target);
            if (result != null) {
                System.out.println("Indices of the numbers: " + result[0] + ", " + result[1]);
            } else {
                System.out.println("Solution not found.");
            }
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        return null;
    }
}