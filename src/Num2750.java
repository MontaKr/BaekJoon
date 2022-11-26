import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2750 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int array [] = new int[number];

        for(int i=0; i<number; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<number-1; i++) {
            for(int j=i+1; j<number; j++) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }

        for(int x : array) {
            System.out.println(x);
        }

    }
}
