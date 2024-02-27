import java.util.Scanner;

public class P5622 {
    public static void main(String[] args) {
        int count = 0;

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char cur = text.charAt(i);

            switch(cur) {
                case 'A': case 'B': case 'C':
                    count += 3;
                    break;
                case 'D': case 'E': case 'F':
                    count += 4;
                    break;
                case 'G': case 'H': case 'I':
                    count += 5;
                    break;
                case 'J': case 'K': case 'L':
                    count += 6;
                    break;
                case 'M': case 'N': case 'O':
                    count += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    count += 8;
                    break;
                case 'T': case 'U': case 'V':
                    count += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    count += 10;
                    break;
            }
        }

        System.out.println(count);
    }
}
