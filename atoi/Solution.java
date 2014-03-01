public class Solution {
  public static int atoi(String str) {
    if (str.isEmpty() || str == null || str.length() < 1)
      return 0;
    str = str.trim();
    char sign = '+'; // default
    long result = 0;
    int i = 0;
    if (str.charAt(0) == '-') {
      sign = '-';
      i++;
    } else if (str.charAt(0) == '+') {
      i++;
    }
    while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
      result = result * 10 + (str.charAt(i) - '0');
      i++;
    }
    if (sign == '-')
      result = -result;
    if (result > Integer.MAX_VALUE)
      return Integer.MAX_VALUE;
    if (result < Integer.MIN_VALUE)
      return Integer.MIN_VALUE;

    return (int) result;
  }
}