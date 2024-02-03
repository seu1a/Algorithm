import java.io.*;
import java.util.StringTokenizer;

public class P10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer first = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(first.nextToken());
        int[] array = new int[size];
        int count = Integer.parseInt(first.nextToken());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken()) - 1;
            int J = Integer.parseInt(st.nextToken()) - 1;
            int K = Integer.parseInt(st.nextToken());

            for (int j = I; j <= J; j++) {
                array[j] = K;
            }
        }

        for (int k = 0; k < size; k ++) {
            bw.write(array[k] + " ");
        }

        bw.close();
    }
}
