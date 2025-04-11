package ArrayQuestions;

public class RotateArray {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        rotate(nums, 3);
        displayArray(nums);
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length; // To avoid extra rotations if k > length
        for (int i = 0; i < k; i++) {
            rightSwap(nums);
        }
    }

    public static void leftSwap(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
    }

    public static void rightSwap(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }

    public static void displayArray(int nums[]) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
