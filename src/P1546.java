import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class P1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double[] array = new double[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(st.nextToken());
        }

        double result = 0;
        Arrays.sort(array);

        for (int j = 0; j < array.length; j++) {
            result += array[j] / array[array.length - 1] * 100;
        }

        bw.write(String.valueOf(result / array.length));
        bw.close();
    }
}
