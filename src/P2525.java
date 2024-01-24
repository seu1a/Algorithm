import java.util.Scanner;

public class P2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int min = scan.nextInt();

        int add = scan.nextInt();

        min += add;
        hour += min / 60;
        min %= 60;
        hour %= 24;

        System.out.printf("%d %d", hour, min);
    }
}
