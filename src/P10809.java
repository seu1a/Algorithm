import java.util.Scanner;

public class P10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();

        for (int i = 'a'; i <= 'z'; i++) {
            boolean isExist = false;

            for (int j = 0; j < text.length(); j++) {
                if (String.valueOf(text.charAt(j)).equals(Character.toString((char) i))) {
                    System.out.print(j + " ");
                    isExist = true;
                    break;

                }
            }

            if (!isExist) {
                System.out.print("-1 ");
            }
        }
    }
}
