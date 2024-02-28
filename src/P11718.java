import java.io.*;

public class P11718 {
    public static void main(String[] args) throws IOException {
        String text = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while ((text = br.readLine()) != null) {
            System.out.println(text);
        }
    }
}
