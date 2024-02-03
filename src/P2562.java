import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9; i ++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int max = Collections.max(list);

        System.out.println(max + "\n" + (list.indexOf(max) + 1));
    }
}
