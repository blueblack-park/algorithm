package leetcode.explore.array;

/**
 * Max Consecutive Ones
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 *
 * Example 2:
 *
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

        int[] nums = new int[] {1,1,0,1,1,1};
        int answer = solution.findMaxConsecutiveOnes(nums);
        System.out.println(answer);

        int[] nums2 = new int[] {1,0,1,1,0,1};
        answer = solution.findMaxConsecutiveOnes(nums2);
        System.out.println(answer);

        int[] nums3 = new int[] {0};
        answer = solution.findMaxConsecutiveOnes(nums3);
        System.out.println(answer);

        int[] nums4 = new int[] {1};
        answer = solution.findMaxConsecutiveOnes(nums4);
        System.out.println(answer);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int target = 1;
        int count = 0;
        for (int num : nums) {
            if (target == num) {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (maxCount < count) {
            maxCount = count;
        }
        return maxCount;
    }
}
