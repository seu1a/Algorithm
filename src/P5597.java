import java.io.*;

public class P5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Boolean[] array = new Boolean[30];

        for (int i = 0; i < 30; i ++) {
            array[i] = false;
        }

        for (int i = 0; i < 28; i ++) {
            array[Integer.parseInt(br.readLine()) - 1] = true;
        }

        for (int i = 0; i < 30; i ++) {
            if (!array[i]) {
                bw.write((i + 1) + "\n");
            }
        }

        bw.close();
    }
}
