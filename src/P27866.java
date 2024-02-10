import java.io.*;

public class P27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();

        bw.write(string.charAt(Integer.parseInt(br.readLine()) - 1));
        bw.close();
    }
}
