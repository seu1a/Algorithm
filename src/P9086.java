import java.util.Scanner;

public class P9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            String text = scanner.next();

            System.out.print(text.charAt(0));
            System.out.print(text.charAt(text.length() - 1) + "\n");
        }
    }
}
