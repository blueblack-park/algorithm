package leetcode.explore.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Squares of a Sorted Array
 *
 * Solution
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 *
 */
public class Squares {
    public static void main(String[] args) {
        Squares solution = new Squares();

        int[] nums = new int[] {-4,-1,0,3,10};
        int[] answer = solution.sortedSquares(nums);
        solution.print(answer);

        int[] nums2 = new int[] {-7,-3,2,3,11};
        answer = solution.sortedSquares(nums2);
        solution.print(answer);
    }

    public int[] sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int num : nums) {
            list.add(num*num);
        }
        Collections.sort(list);

        int[] answer = new int[nums.length];
        for (int inx=0; inx<nums.length; inx++) {
            answer[inx] = list.get(inx);
        }
        return answer;
    }

    public void print(int[] nums) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
