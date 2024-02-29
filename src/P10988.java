import java.util.Scanner;

public class P10988 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        StringBuilder sb = new StringBuilder(text);

        if (text.equals(sb.reverse().toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
