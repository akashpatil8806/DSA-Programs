import java.util.Arrays;

public class DistinctNumberArray {

    public static int[] findLargestThreeDistinct(int[] nums) {

        Arrays.sort(nums); // Sort the array in ascending order
        int n = nums.length;
        int[] result = new int[3];

        int Count = 0;
        // Start from the end of the array and iterate backwards
        for (int i = n - 1; i >= 0 && Count < 3; i--) {
            // Check if the current element is different from the next one
            if (i == n - 1 || nums[i] != nums[i + 1]) {
                result[Count] = nums[i];
                Count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 5, 7, 3, 10, 7, 4, 6, 8, 10,9 }; // Example array
        int[] largestThree = findLargestThreeDistinct(nums);
        System.out.println("The largest three distinct elements are: " + Arrays.toString(largestThree));
    }
}
