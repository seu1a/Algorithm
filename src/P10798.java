import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P10798 {
    public static void main(String[] args) {
        int max = -1;

        String text = "";

        List<String> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String temp = scan.nextLine();

            list.add(temp);

            if (temp.length() > max) {
                max = temp.length();
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                try {
                    String temp = list.get(j);
                    text += String.valueOf(temp.charAt(i));
                } catch (Exception e) {}
            }
        }

        System.out.println(text);
    }
}
