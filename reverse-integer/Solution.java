public class Solution {
  // Reverse Integer 
  // http://oj.leetcode.com/problems/reverse-integer/
  public static int reverse(int x) {
    if (x >= 0 & x <= 9)
                return x;
    String xstr = String.valueOf(x);
    StringBuffer sb = new StringBuffer();
    if (x < 0) {
      sb.append('-');
      for (int i = xstr.length() - 1; i >= 1; i--) {
        sb.append(xstr.charAt(i));
      }
    } else {
      for (int i = xstr.length() - 1; i >= 0; i--) {
        sb.append(xstr.charAt(i));
      }
    }
    xstr = sb.toString();
    return Integer.parseInt(xstr);
  }
  
}
