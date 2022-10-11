package exam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;
//��ū��
public class backjoon17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        // ���۵� ������ �а�
        // ���� ��ü ����
        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];
        // N���� seq�� �迭�� ���
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }


        for(int i = 0; i < N; i++) {
            while(!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
                seq[stack.pop()] = seq[i];
            }
            // ������ ������� �ʰ� , seq�� ��� ���� ���� seq�� i��° ���� ū ���
            // ���ÿ� �ִ� ���� pop��Ű�� i���� push���Ѽ� ���� �ִ´�
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }
        //�׷��� ���� ���� ��� -1�� �ִ´�

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(seq[i]).append(' ');
        }
        //�� �迭���� �� ������

        System.out.println(sb);
        //�� ������ ����Ѵ�.
    }
}
