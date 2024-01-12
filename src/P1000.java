import java.util.Scanner;

public class P1000 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            스캐너의 next() 메서드는
            문자열의 공백을 기준으로
            나누어 반환
        */
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a + b);
    }
}
