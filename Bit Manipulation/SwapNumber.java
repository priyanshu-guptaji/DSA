public class SwapNumber{
    public static void main(String[] args) {
        int a = 45 , b = 56;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Value after Swapping of a is = " +a+ " and value of b after Swapping is = " +b);
    }
}