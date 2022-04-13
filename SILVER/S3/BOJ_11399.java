// BOJ_11399_ATM

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11399 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] line = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++)
            line[i]=Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        Arrays.sort(line);
        int result=0;
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=line[i];
            result+=sum;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
