/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Example:
 *
 * Input: nums = [2,2,1]
 * Output: 1
 *
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 *
 * https://leetcode.com/problems/single-number/
 */
public class Main {

  /**
   * Based on the <link>https://en.wikipedia.org/wiki/Involution_(mathematics)<link>self inverse property of xOR operator,
   * xOR-ing 2 identical values produces 0 or the original value.
   *
   * E.g. 10 (1010) & 10 (1010) = 0 as:
   *
   * 0 ^ 0 = 0
   * 0 ^ 1 = 1
   * 1 ^ 0 = 1
   * 1 ^ 1 = 0
   *
   * Back to our problem, if we perform the xOR operator on the values in <b>nums</b>,
   * only the single number will remain as the rest will be self-inversed.
   */
  public static int singleNumber(int[] nums) {
    int result = 0;

    for (int num : nums) {
      result ^= num;
    }

    return result;
  }
}
