// BOJ_13752_히스토그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_13752 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int k = Integer.parseInt(br.readLine());
            for(int j=0;j<k;j++){
                System.out.print("=");
            }
            System.out.println();
        }
        br.close();
    }
}