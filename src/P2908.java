import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P2908 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            StringTokenizer st = new StringTokenizer(scan.nextLine());

            int first = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
            int second = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());

            if (first > second) {
                System.out.println(first);
            } else {
                System.out.println(second);
            }
        }
    }
