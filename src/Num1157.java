import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        //알파벳 배열 선언
        int array [] = new int [26];
        int max = -1;
        char ch = '?';

        for(int i=0; i<str.length(); i++) {
            //대문자 범위
            if(str.charAt(i)>=65 && str.charAt(i)<=90) {
                array[str.charAt(i)-'A']++;
            }

            //소문자 범위
            else {
                array[str.charAt(i)-'a']++;
            }
        }

        for(int i=0; i<26; i++) {
            if(array[i]>max) {
                max = array[i];
                ch = (char)(i+65);
            }

            else if (array[i]==max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
