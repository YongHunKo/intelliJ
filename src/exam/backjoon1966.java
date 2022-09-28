package exam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.LinkedList;
//������ ť
public class backjoon1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        // �׽�Ʈ ���̽�

        while (T-- > 0) {
        //T����ŭ while�� �����ٴ�
           StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); //���� ����
            int M = Integer.parseInt(st.nextToken()); //�츮�� �ñ��� �ڷ� ��ġ

            LinkedList<int[]> q = new LinkedList<>();
            // ���׸����� int�迭�� �� ������ �ʱ� ��ġ�� �߿䵵�� �ֱ� ���ؼ� ��
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                q.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
                // [�ʱ� ��ġ, �߿䵵]
                // ���� ���� ��ŭ for���� ���ư��� ���ÿ� �츮�� �߿䵵�� �Է��ϴµ��� ��ƹ���
                // 3 0
                // 5 8 9 �̸�
                // for���� 3ȸ �����̰�
                // ù��° ���� 5�̶�� �߿䵵�� ���� ����� -> [0, 5], [1, 8], [2, 9]
            }

            int count = 0;	// ��� Ƚ��

            while (!q.isEmpty()) {	// ��ũ�帮��Ʈ�� ������� ������ ��� ������

                int[] front = q.poll();	// ���� ù ����
                boolean isMax = true;	// front ���Ұ� ���� ū ���������� �Ǵ��ϴ� ����

                // ť�� �����ִ� ���ҵ�� �߿䵵�� ��
                for(int i = 0; i < q.size(); i++) {

                    // ó�� ���� ���Һ��� ť�� �ִ� i��° ���Ұ� �߿䵵�� Ŭ ���
                    if(front[1] < q.get(i)[1]) {

                        // ���� ���� �� i ������ ���ҵ��� �ڷ� ������.
                        q.offer(front);
                        for(int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }

                        // front���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� false�� �ϰ� Ž���� ��ħ
                        isMax = false;
                        break;
                    }
                }

                // front ���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� ���� �ݺ������� �Ѿ
                if(isMax == false) {
                    continue;
                }

                // front ���Ұ� ���� ū ���ҿ����Ƿ� �ش� ���Ҵ� ����ؾ��ϴ� ������.
                count++;
                if(front[0] == M) {	// ã���� �ϴ� ������� �ش� �׽�Ʈ���̽� ����
                    break;
                }

            }

            sb.append(count).append('\n'); //�׶��� Ƚ���� ��Ʈ�������� ����

        }
        System.out.println(sb);
    }

}
