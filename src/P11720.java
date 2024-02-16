import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String text = scanner.next();

        int result = 0;

        for (int i = 0; i < N; i++) {
            result += Integer.parseInt(String.valueOf(text.charAt(i)));
        }

        System.out.println(result);
    }
}
