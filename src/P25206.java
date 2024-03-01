import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P25206 {
    public static void main(String[] args) throws IOException {
        double totalMultiply = 0;
        double totalHakjum = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(scan.nextLine());

            String subjectName = st.nextToken();
            double subjectHakjum = Double.parseDouble(st.nextToken());
            String subjectGradeTemp = st.nextToken();

            if (subjectGradeTemp.equals("P")) {
                continue;
            }

            double subjectGrade = 0;

            switch(subjectGradeTemp) {
                case "A+":
                    subjectGrade = 4.5;
                    break;
                case "A0":
                    subjectGrade = 4.0;
                    break;
                case "B+":
                    subjectGrade = 3.5;
                    break;
                case "B0":
                    subjectGrade = 3.0;
                    break;
                case "C+":
                    subjectGrade = 2.5;
                    break;
                case "C0":
                    subjectGrade = 2.0;
                    break;
                case "D+":
                    subjectGrade = 1.5;
                    break;
                case "D0":
                    subjectGrade = 1.0;
                    break;
                case "F":
                    subjectGrade = 0.0;
                    break;
            };

            totalHakjum += subjectHakjum;
            totalMultiply += subjectHakjum * subjectGrade;
        }

        double result = totalMultiply / totalHakjum;

        System.out.printf("%.6f\n", result);
    }
}
