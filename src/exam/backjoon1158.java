package exam;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class backjoon1158 {
//�似Ǫ�� ���� ��
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        // Queue�� 1~N���� ���� offer�Ѵ�.
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // Queue�� ����� 1�� ������ �ݺ��Ѵ�.
        while(q.size() != 1) {
            // K - 1��°������ ó���� �ִ� ���� �� �ڷ� ������.
            for (int i = 0; i < K - 1; i++) {
                q.offer(q.poll());
            }
            // K��° ���� poll�� �� ����Ѵ�.
            sb.append(q.poll() + ", ");
        }

        // Queue�� ����� 1�� ���� �ܼ��� poll�ϸ� �ȴ�.
        sb.append(q.poll() + ">");

        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}