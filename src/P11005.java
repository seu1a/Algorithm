import java.util.Scanner;

public class P11005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int B = scan.nextInt();
        int N = scan.nextInt();

        System.out.println(Integer.toString(B, N).toUpperCase());
    }
}
