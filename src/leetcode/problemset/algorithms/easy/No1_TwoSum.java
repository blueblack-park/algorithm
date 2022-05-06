package leetcode.problemset.algorithms.easy;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class No1_TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;

        int[] nums2 = new int[] {3,2,4};
        int target2 = 6;

        int[] nums3 = new int[] {3,3};
        int target3 = 6;

        No1_TwoSum solution = new No1_TwoSum();
        int[] answer = solution.twoSum(nums, target);
        solution.print(answer);

        int[] answer2 = solution.twoSum(nums2, target2);
        solution.print(answer2);

        int[] answer3 = solution.twoSum(nums3, target3);
        solution.print(answer3);
    }

    public int[] twoSum(int[] nums, int target) {
        for (int inx=0; inx<nums.length; inx++) {
            for (int jnx=0; jnx<nums.length; jnx++) {
                if (inx != jnx) {
                   int tmpSum =  nums[inx] + nums[jnx];
                   if (tmpSum == target) {
                       return new int[] {inx, jnx};
                   }
                }
            }
        }
        return null;
    }
    public void print(int[] nums) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
