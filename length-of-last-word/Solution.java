public class Solution {
    public static int lengthOfLastWord(String s) {
        if (s.isEmpty() || s == null)
            return 0;
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) != ' '){
                len++;
            }
            if (len > 0 && s.charAt(i) == ' '){
                return len;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String[] str = {"strawberry fields forever", "a ", " a", " ", "aa bb ccd   ", "rendering"};
        for (int i = 0; i < str.length; i++){
            System.out.println(str[i] + ", " + lengthOfLastWord(str[i]));
        }
    }
}