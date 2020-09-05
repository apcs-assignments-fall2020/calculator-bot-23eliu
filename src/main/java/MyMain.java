import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int big1 = Math.max(a, b);
        if (big1 < c) {
            return big1;
        }
        return Math.max(Math.min(a, b), c);

    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a) > Math.abs(b)) {
            return a;
        }
        return b;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double squared = (Math.pow(a, 2) + Math.pow(b, 2));
        return Math.sqrt(squared);
    }

    public static void main(String[] args) {
        System.out.println("What method would you like to use?");
        Scanner scan = new Scanner(System.in);
        if (scan.next().equals("median")) {
            System.out.println(median(1, 2, 3));
        }
        if (scan.next().equals("magnitude")) {
            System.out.println(magnitude(-7, -1));
        }
        if (scan.next().equals("pythagoras")) {
            System.out.println(pythagoras(3, 4));
        }
    }
}
