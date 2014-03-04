public class Solution{
  // Rotate Image
  // http://oj.leetcode.com/problems/rotate-image/
  public static void rotate(int[][] matrix){
    int n = matrix.length;
    for (int layer = 0; layer < n / 2; layer++){
      int first = layer;
      int last = n - 1 - layer;
      for (int i = first; i < last; i++){
        int offset = i - first;
        int top = matrix[first][i]; // save top
        matrix[first][i] = matrix[last - offset][first]; // top <- left
        matrix[last - offset][first] = matrix[last][last - offset]; // left <- bottom
        matrix[last][last - offset] = matrix[i][last]; // bottom <- right
        matrix[i][last] = top; // right <- saved top
      }
    }
  }
}
