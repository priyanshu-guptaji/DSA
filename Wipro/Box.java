import java.util.*;

class BoxDetails {
    double length, width, height;

    BoxDetails(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getVolume() {
        return length * width * height;
    }

    public boolean equals(Object obj) {
        BoxDetails b = (BoxDetails) obj;
        return this.getVolume() == b.getVolume();
    }

    public int hashCode() {
        return (int) getVolume();
    }
}

public class Box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Box");
        int n = sc.nextInt();

        Set<BoxDetails> set = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Length");
            double l = sc.nextDouble();

            System.out.println("Enter Width");
            double w = sc.nextDouble();

            System.out.println("Enter Height");
            double h = sc.nextDouble();

            BoxDetails b = new BoxDetails(l, w, h);
            set.add(b); 
        }

        System.out.println("Number of unique boxes = " + set.size());

        sc.close();
    }
}