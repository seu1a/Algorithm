import java.util.Scanner;

public class P2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int min = scan.nextInt();

        if (min - 45 < 0) {
            hour -= 1;
            min += 60;

            if (hour < 0) {
                hour = 23;
            }
        }

        min -= 45;

        System.out.printf("%d %d", hour, min);
    }
}
