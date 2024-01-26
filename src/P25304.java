import java.util.Scanner;

public class P25304 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            총 금액
        */
        int X = scan.nextInt();

        /*
            줄 갯수
        */
        int N = scan.nextInt();

        /*
            총 금액
        */
        int result = 0;

        for (int i = 0; i < N; i ++) {
            result += scan.nextInt() * scan.nextInt();
        }

        if (X == result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
