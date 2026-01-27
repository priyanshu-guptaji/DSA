public class Setbit {
    public static void main(String[] args) {
        int num = 5, i = 0;

        if (((num >> i) & 1) == 1) {
            System.out.println("The bit is set.");
        } else {
            System.out.println("The bit is NOT set.");
        }
    }
}
