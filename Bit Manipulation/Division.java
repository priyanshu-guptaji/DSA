public class Division {
    public static void main(String[] args) {
        int dividend = 10, divisor = 3;
        int sum = 0;
        int cnt = 0;

        while (sum + divisor <= dividend) {
            sum = sum + divisor;
            cnt++;
        }

        System.out.println(cnt);
    }
}
