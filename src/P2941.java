import java.util.Scanner;

public class P2941 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;

        String line = scan.nextLine();

        for (int i = 0; i < line.length(); i++) {
            try {
                if (line.charAt(i) == 'd' && line.charAt(i + 1) == 'z' && line.charAt(i + 2) == '=') {
                    i += 2;
                } else if (line.charAt(i) == 'l' && line.charAt(i + 1) == 'j') {
                    i++;
                } else if (line.charAt(i) == 'n' && line.charAt(i + 1) == 'j') {
                    i++;
                } else if (line.charAt(i + 1) == '=' || line.charAt(i + 1) == '-') {
                    i++;
                }
            } catch (Exception e) {}

            count += 1;
        }

        System.out.println(count);
    }
}
