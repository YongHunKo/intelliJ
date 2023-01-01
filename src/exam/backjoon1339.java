package exam;
import java.io.*;
import java.util.*;
//단어 수학
public class backjoon1339 {
    //알파벳들에 숫자를 부여해서 최대값을 찾는 알고리즘
    public static int[] alpha = new int[26];
    //알파벳이 26개이므로 26개 배열
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //버퍼드리더로 읽고
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            int size = line.length();

            int base = (int) Math.pow(10, size - 1);

            for (int j = 0; j < size; j++) {
                alpha[line.charAt(j) - 'A'] += base;
                base /= 10;
            }
        }

        Arrays.sort(alpha);

        int ans = 0;

        for (int i = 25; i >= 17; i--) {
            ans += alpha[i] * (i - 16);
        }

        System.out.println(ans);


    }   //ABCD+ABC 면 A*1100+B*110+C*11+D 로 표현가능
        //따라서 단어가 주어질때 문자열을 곱하는 수를 더하고
        //곱해진 값이 큰수부터 큰값으로 바꾸는 식


}