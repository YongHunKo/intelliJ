package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//나머지 완
public class backjoon10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //버퍼드리더를 줬으면 스트링 토크나이저를 잊지말자(안주면 다음줄로 넘겨서 써야함)
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // 이 문제를 수학적 증명을 말할까 말까 심히 고민됨

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println((A+B)%C);
        System.out.println((A%C)+(B%C)%C);
        System.out.println((A*B)%C);
        System.out.println((A%C * B%C)%C );



    }
}
