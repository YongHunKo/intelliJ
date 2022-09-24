package exam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class backjoon1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();	// ����� ����� ����

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        int start = 0;

        // N �� �ݺ�
        while(N -- > 0) {

            int value = Integer.parseInt(br.readLine());

            if(value > start) {
                // start + 1���� �Է¹��� value ���� push�� �Ѵ�.
                for(int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');	// + �� �����Ѵ�.
                } // 12->���ÿ���
                start = value; 	// ���� push �� ���� ���������� �����ϱ� ���� ���� �ʱ�ȭ
            }

            // top�� �ִ� ���Ұ� �Է¹��� ���� ���� ���� ���
            else if(stack.peek() != value) {
                System.out.println("NO");
                return;		// �Ǵ� System.exit(0); ���� ��ü�ص� ��.
            }

            stack.pop();//43
            sb.append('-').append('\n'); //pop(4) pop(3) pop(6) pop(8) pop(7) pop(5) pop(2) pop(1)->���

        }

        System.out.println(sb);
    }
}