// Problem: Move Zeroes
// Approach: Two pointers (in-place)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        // Fill remaining positions with zero
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
