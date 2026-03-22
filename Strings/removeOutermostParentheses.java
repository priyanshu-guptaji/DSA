class Solution {
    public String removeOuterparentheses(String s) {
        StringBuilder result = new StringBuilder();
        int level = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (level > 0) result.append(ch);
                level++;
            } else {
                level--;
                if (level > 0) result.append(ch);
            }
        }
        return result.toString();
    }
}

public class removeOutermostParentheses {
    public static void main(String[] args) {

        String s = "(())";

        Solution sol = new Solution();
        String ans = sol.removeOuterparentheses(s);

        System.out.println("THE RESULT IS : " + ans);
    }
}