package exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
//��
public class backjoon9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            sb.append(solve(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }

    public static String solve(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // ���� ��ȣ�� ��� ���ÿ� �ִ´�.
            if (c == '(') {
                    stack.push(c);
            }

            // �Ʒ��� ��� �ݴ� ��ȣ �� �����̴�.

            // ������ ����ִ� ���. ��, �ݴ� ��ȣ�� �Է¹޾����� pop�� ���Ұ� ���� ���
            else if (stack.empty()) {
                return "NO";
            }
            // �� ���� ��� stack ���Ҹ� pop �Ѵ�.
            else {
                stack.pop();
            }
        }

        /*
         * ��� �˻� ��ġ�� ���ÿ� �ܿ� ��Ұ� ������ ���� ��ȣ�� ���� ���� "NO"
         * ������ ��������� ������ �����̹Ƿ� "YES" �̴�.
         */

        if (stack.empty()) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}