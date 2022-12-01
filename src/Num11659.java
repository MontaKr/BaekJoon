import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열 수
        int N = Integer.parseInt(st.nextToken());
        // 질의 수
        int M = Integer.parseInt(st.nextToken());

        // 배열 합
        int sum [] = new int [N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) {
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }

        // 구간 합
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(sum[b]-sum[a-1]);
        }


    }
}
