public class Solution {
  // Single Number
  // http://oj.leetcode.com/problems/single-number/
  public static int singleNumber(int[] A) {
    int result = 0;
    for (int i : A)
      result ^= i;
    return result;
  }
}
