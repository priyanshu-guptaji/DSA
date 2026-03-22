
class Solution{
    public String largeOddNum(String s){
        int ind = -1;

        int i;

        for(i = s.length() - 1 ; i >=0 ; i--){
            if((s.charAt(i) - '0') % 2 == 1){
                ind = i;
                break;
            }
        }

        if (ind == -1) return "";

        i=0;



        while(i <= ind && s.charAt(i) == '0') i++;

        return s.substring(i , ind+1);
    }
}
public class largestNumber {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String num = "504";

        String result = sol.largeOddNum(num);


        System.out.println("Largest Odd number : " +result);
    }
}
