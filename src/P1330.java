import java.util.Scanner;

public class P1330 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = scan.nextInt();
        int second = scan.nextInt();

        if (first == second) {
            System.out.println("==");
        } else if (first > second) {
            System.out.println(">");
        } else {
            System.out.println("<");
        }
    }
}
