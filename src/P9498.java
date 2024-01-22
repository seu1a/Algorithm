import java.util.Scanner;

public class P9498 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();

        if (100 >= score & score >= 90) {
            System.out.println("A");
        } else if (90 > score & score >= 80) {
            System.out.println("B");
        } else if (80 > score & score >= 70) {
            System.out.println("C");
        } else if (70 > score & score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
