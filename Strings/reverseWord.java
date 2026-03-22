class Solution{
    public String reversewords(String s){

        StringBuilder result = new StringBuilder();

        int i = s.length() - 1;

        while(i >= 0){

            // skip spaces
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }

            if(i < 0) break;

            int end = i;

            // find start of word
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }

            String word = s.substring(i + 1, end + 1);

            if(result.length() > 0){
                result.append(" ");
            }

            result.append(word);
        }
        return result.toString();
    }
}

public class reverseWord {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = " Amazing Coding Skills";

        System.out.println(sol.reversewords(s));
    }
}