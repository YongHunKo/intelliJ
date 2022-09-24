package exam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
//������ ��
public class backjoon1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            leftStack.push(str.charAt(i));
        }

        int N  = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String cmd = br.readLine();
            switch (cmd.charAt(0)){
                case 'L': //Ŀ���� �������� ��ĭ �ű�-> ���� ���ÿ��� pop�� ���� ������ ���ÿ� push
                    if(leftStack.empty()) break;
                    //������ ��������� break�� ��������
                    rightStack.push(leftStack.pop());
                    break;
                case 'D': // Ŀ���� ���������� ��ĭ �ű�-> ���� �ݴ�� ������ ���ÿ��� pop�� ���� ���ʿ�
                    if(rightStack.empty()) break;
                    leftStack.push(rightStack.pop());
                    break;
                case 'B': // Ŀ�� ���� �ϳ��� ������->�׳� ���ʰ��� �˽��ѹ����ٴ� ����
                    if(leftStack.empty()) break;
                    leftStack.pop();
                    break;
                case 'P':// ������ ������ push
                    leftStack.push(cmd.charAt(2));
                    break;
            }
        }
        while(!leftStack.empty()){
            rightStack.push(leftStack.pop());
        }
        StringBuilder sb = new StringBuilder();
        while (!rightStack.empty()){
            sb.append(rightStack.pop());
        }
        System.out.println(sb.toString());
    }
}