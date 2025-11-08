// Check if a number is a Power of 2 or not
public class Powerof2 {
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
    }
}
