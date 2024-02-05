import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer[] array = new Integer[10];

        for (int i = 0; i < 10; i ++) {
            array[i] = Integer.parseInt(br.readLine()) % 42;
        }

        List<Integer> list = Arrays.stream(array).distinct().collect(Collectors.toList());

        bw.write(String.valueOf(list.size()));
        bw.close();
    }
}
