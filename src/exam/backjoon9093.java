package exam;

import java.io.*;
import java.util.Stack;
//��
public class backjoon9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while (t --> 0){
            // �̰� ���� Ƚ��
            // t --; �� t > 0; �� ��ģ ��
            Stack<Character> stack = new Stack<>();
            String str = br.readLine() + "\n";
            for(char ch : str.toCharArray()){
                //String.toCharArray�� ���ڿ��� �ϳ��ϳ� �ɰ��� �迭�� ����ִ� �޼ҵ�
                //�츮�� ���ÿ� ����ֱ⶧���� �迭 X
                if(ch == ' ' || ch == '\n'){
                    while (!stack.isEmpty()){
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                }
                else stack.push(ch);
            }
        }
        bw.flush();
    }
    // ���忡�� �����̳� ������ ������ ������ stack�� �����͸� ���,
    //�����̳� ������ ������ �� ���ÿ��� �����͸� ���� ���ۿ� ��´�.
    //���� �� ������ġ��(�����̳� ����)�� ���ۿ� ��´�.
    //�׸��� �� ���۸� �д´�.
}
