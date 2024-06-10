public class MissingnumberArray {
    
        public static int findMissingNumber(int[] nums) {
            int n = nums.length + 1;
            int sum = n * (n + 1) / 2; // Sum of all numbers from 1 to n
            int arraySum = 0;
            for (int num : nums) {
                arraySum += num;
            }
            return sum - arraySum;
        }
    
        public static void main(String[] args) {
            int[] nums = {1, 2, 4, 5, 6}; // Example array with one missing number
            int missingNumber = findMissingNumber(nums);
            System.out.println("The missing number is: " + missingNumber);
        }
    }
    
    

