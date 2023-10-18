import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nine = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            nine[i] = Integer.parseInt(br.readLine());
            sum += nine[i];
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j) {
                    continue;
                }
                boolean seven = sum - nine[i] - nine[j] == 100;
                if (seven) {
                    nine[i] = 0;
                    nine[j] = 0;
                    Arrays.sort(nine);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(nine[k]);
                    }
                    return;
                }
            }
        }
    }
}
