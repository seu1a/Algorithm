import java.util.Scanner;

public class P8393 {
    public static void main(String[] args) {
        int result = 0;

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            result += i;
        }

        System.out.println(result);
    }
}
