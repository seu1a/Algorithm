import java.util.Scanner;

public class P2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = scan.nextInt();
        int second = scan.nextInt();

        System.out.println(first * (second % 10));
        System.out.println(first * (second % 100 / 10));
        System.out.println(first * (second / 100));

        System.out.println(first * second);
    }
}
