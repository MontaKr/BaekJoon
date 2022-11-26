import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //과목 개수
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //배열 선언
        double array [] = new double[N];

        //배열에 수 넣기
        for(int i=0; i<N; i++) {
            array[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;

        //배열 오름차순 정리
        Arrays.sort(array);

        //최댓값
        double max = array[N-1];

        //배열 재정립
        for(int i=0; i<N; i++) {
            array[i] = array[i]/max*100;
        }

        //배열 합
        for(int i=0; i<N; i++) {
            sum += array[i];
        }

        //평균 출력
        System.out.println(sum/N);
    }
}