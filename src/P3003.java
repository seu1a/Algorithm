import java.util.Scanner;

public class P3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] arr = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] - sc.nextInt() + " ");
        }
    }
}
