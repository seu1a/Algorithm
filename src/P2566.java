import java.util.Scanner;

public class P2566 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -1;
        String maxIndex = "";
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int temp = scan.nextInt();

                arr[i][j] = temp;

                if (temp > max) {
                    max = temp;
                    maxIndex = (i + 1) + " " + (j + 1);
                }
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
    }
}
