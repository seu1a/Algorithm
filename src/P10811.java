import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> result = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            result.add(i);
        }

        for (int j = 0; j < M; j++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int first = Integer.parseInt(st1.nextToken());
            int second = Integer.parseInt(st1.nextToken());

            List<Integer> temp = new ArrayList<>();

            for (int k = second - 1; k >= first - 1; k--) {
                temp.add(result.get(k));
            }

            for (int x = first - 1; x <= second - 1; x++) {
                result.set(x, temp.remove(0));
            }
        }

        for (Integer integer : result) {
            bw.write(integer + " ");
        }

        bw.close();
    }
}
