package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//최대공약수 최소공배수
public class backjoon2609 {
    public static int getGCD(int A, int B) {
        // 먼저 최대공약수 메소드 하나를 생성
        if (A % B == 0) //B가 A의 공약수인 경우 B가 최대공약수 이므로 B를 리턴
            return B;
        return getGCD(B, A % B);// 아닐 경우는 B를 A자리에 넣고 A%B를 B자리에 넣고 다시 돌린다
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder str = new StringBuilder();
        //데이터 읽고 스트링빌더 객체 생성
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int gcd = getGCD(Math.max(A, B), Math.min(A, B));
        // A,B중 큰값을 A자리로 넣고 최대공약수 메소드를 돌린다
        str.append(gcd).append("\n");
        //스트링빌더에 최대공약수를 저장하고
        str.append(A * B / gcd);
        //최소공배수 * 최대공약수 = A * B 라는 것을 이용하여
        //최소공배수를 구하여 스트링빌더에 저장
        System.out.println(str);
        //스트링빌더를 출력
        br.close();
        //버퍼드리더도 중단해야 부하 안걸림림        }
    }
}


