import java.util.*;

class getSunday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        String arr[] = {"mon","tue","wed","thu","fri","sat","sun"};

        int i;

        for(i = 0; i < arr.length; i++) {
            if(arr[i].equals(str))
                break;
        }

        int rem = 6 - i;
        int res = 0;

        if(rem < n) {
            res = 1;
            n = n - rem - 1;
            res += n / 7;
        }

        System.out.println(res);
    }
}