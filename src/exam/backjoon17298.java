package exam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;
//오큰수
public class backjoon17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        // 버퍼드 리더로 읽고
        // 스택 객체 생성
        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];
        // N값을 seq에 배열로 담고
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }


        for(int i = 0; i < N; i++) {
            while(!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
                seq[stack.pop()] = seq[i];
            }
            // 스택이 비어있지 않고 , seq에 담긴 현재 값과 seq에 i번째 값이 큰 경우
            // 스택에 있는 값을 pop시키고 i값을 push시켜서 값을 넣는다
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }
        //그러한 수가 없는 경우 -1을 넣는다

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(seq[i]).append(' ');
        }
        //각 배열마다 다 돌리고

        System.out.println(sb);
        //그 값들을 출력한다.
    }
}
