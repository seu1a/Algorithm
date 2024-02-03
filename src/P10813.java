import java.io.*;
import java.util.StringTokenizer;

public class P10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int[] array = new int[size];

        for (int i = 0; i < size; i ++) {
            array[i] = i + 1;
        }

        int count = Integer.parseInt(st.nextToken());

        for (int j = 0; j < count; j ++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st1.nextToken()) - 1;
            int J = Integer.parseInt(st1.nextToken()) - 1;

            int temp = array[J];
            array[J] = array[I];
            array[I] = temp;
        }

        for (int k = 0; k < size; k ++) {
            bw.write(array[k] + " ");
        }

        bw.close();
    }
}
