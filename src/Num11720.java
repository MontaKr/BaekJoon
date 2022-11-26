import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        //숫자 개수 입력
        int N = Integer.parseInt(br.readLine());

        //수 입력
        String sNum = br.readLine();

        //입력 받은 수 char형으로 변환
        char array [] = sNum.toCharArray();

        //합 구하기
        for(int i=0; i<N; i++) {
            sum += array[i]-'0';
        }

        System.out.println(sum);

    }
}
