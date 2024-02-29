import java.util.Scanner;

public class P2444 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println(" ".repeat(count - i - 1) + "*".repeat(1 + (2 * i)));
        }

        for (int i = count - 1; i > 0; i--) {
            System.out.println(" ".repeat(count - i) + "*".repeat(1 + (2 * (i - 1))));
        }
    }
}