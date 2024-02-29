import java.util.Scanner;

public class P1157 {
    public static void main(String[] args) {
        int[] arr = new int[26];

        char ch = '?';

        int max = -1;

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        for (int i = 0; i < text.length(); i++) {
            // 대문자라면
            if ('A' <= text.charAt(i) && text.charAt(i) <= 'Z') {
                arr[text.charAt(i) - 'A'] += 1;
            } else { // 소문자라면
                arr[text.charAt(i) - 'a'] += 1;
            }
        }

        for (int j = 0; j < 26; j++) {
            if (arr[j] > max) {
                max = arr[j];
                ch = (char) (j + 'A');
            } else if (arr[j] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
