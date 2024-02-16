import java.util.Scanner;

public class P2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int Count = scanner.nextInt();
            String Text = scanner.next();

            for (int j = 0; j < Text.length(); j++) {
                System.out.print(String.valueOf(Text.charAt(j)).repeat(Count));
            }

            System.out.print("\n");
        }
    }
}
