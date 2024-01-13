import java.util.Scanner;

public class P1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            자바에서는 정수 / 정수
            하였을 때 소숫점 안뜸
        */
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.println(a / b);
    }
}
