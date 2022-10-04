package exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
//��
public class backjoon10866 {
    public static void main(String[] args) throws IOException {
        // �� = ����� ť
        // �ѹ��⿡���� Ǫ�� �� ��Ű�� ť�� �����Ͽ� �� �ڹ��� ť�� �� �� �ֵ��� ����
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            String[] s = br.readLine().split(" ");

            // ù ��° �ܾ ���� switch-case
            switch (s[0]) {

                case "push_front": {
                    //���ʿ� Ǫ����Ŵ
                    dq.addFirst(Integer.parseInt(s[1]));
                    break;
                }

                case "push_back": {
                    //���ʿ� Ǫ����Ŵ
                    dq.addLast(Integer.parseInt(s[1]));
                    break;
                }

                case "pop_front": {
                    if (dq.isEmpty()) {
                        // ������ �� ��Ŵ
                        // �� ��ų�� ������ -1�� ���
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.pollFirst()).append('\n');
                    }
                    break;
                }

                case "pop_back": {
                    // ���������� ������ �� ��Ŵ
                    if (dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.pollLast()).append('\n');
                    }
                    break;
                }

                case "size": {
                    // �ش� ���� ����� ���
                    sb.append(dq.size()).append('\n');
                    break;
                }

                case "empty": {
                    // �ش� ���� ����Ȱ��� ������ 1�� ���
                    // �ϳ��� ����Ǿ������� 0�� ��·�
                   if (dq.isEmpty()) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                    break;
                }

                case "front": {
                    // �� ���� �տ��ִ� ���� ���
                    // �ƹ��͵� ���� �� -1 ���
                    if (dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.peekFirst()).append('\n');
                    }
                    break;
                }

                case "back": {
                    // �Ȱ��� ����
                    // �� ���� �ڿ� �ִ� ���� ���
                    if (dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.peekLast()).append('\n');
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
