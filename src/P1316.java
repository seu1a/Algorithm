import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1316 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        int count = number;

        scan.nextLine();

        for (int i = 0; i < number; i++) {
            List<Character> list = new ArrayList<>();

            String text = scan.nextLine();

            for (int j = 0; j < text.length(); j++) {
                boolean isContains = list.contains(text.charAt(j));

                if (!isContains) {
                    list.add(text.charAt(j));
                } else if (text.charAt(j - 1) != text.charAt(j)) {
                    count --;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
