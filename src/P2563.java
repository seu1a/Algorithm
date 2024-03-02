import java.util.Scanner;

public class P2563 {
    public static void main(String[] args) {
        int count = 0;
        int[][] arr = new int[100][100];

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        for (int i = 0; i < number; i++) {
            int left = scan.nextInt();
            int bottom = scan.nextInt();

            for (int j = 90 - bottom; j < 100 - bottom; j++) {
                for (int h = left; h < left + 10; h++) {
                    arr[j][h] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i ++) {
            for (int j = 0; j < 100; j ++) {
                if (arr[i][j] == 1) {
                    count += 1;
                }
            }
        }

        System.out.println(count);
    }
}
