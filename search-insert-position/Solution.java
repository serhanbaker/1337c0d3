public class Solution {
    // Search Insert Position
    // http://oj.leetcode.com/problems/search-insert-position/
    public static int searchInsert(int[] A, int target) {
        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target < A[mid])
                high = mid - 1;
            else if (target > A[mid])
                low = mid + 1;
            else
                return mid;
        }
        /* we are out of the loop now
         * therefore, low > high */
        return low;
    }
}
