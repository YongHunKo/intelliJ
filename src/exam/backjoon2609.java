package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//�ִ����� �ּҰ����
public class backjoon2609 {
    public static int getGCD(int A, int B) {
        // ���� �ִ����� �޼ҵ� �ϳ��� ����
        if (A % B == 0) //B�� A�� ������� ��� B�� �ִ����� �̹Ƿ� B�� ����
            return B;
        return getGCD(B, A % B);// �ƴ� ���� B�� A�ڸ��� �ְ� A%B�� B�ڸ��� �ְ� �ٽ� ������
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder str = new StringBuilder();
        //������ �а� ��Ʈ������ ��ü ����
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int gcd = getGCD(Math.max(A, B), Math.min(A, B));
        // A,B�� ū���� A�ڸ��� �ְ� �ִ����� �޼ҵ带 ������
        str.append(gcd).append("\n");
        //��Ʈ�������� �ִ������� �����ϰ�
        str.append(A * B / gcd);
        //�ּҰ���� * �ִ����� = A * B ��� ���� �̿��Ͽ�
        //�ּҰ������ ���Ͽ� ��Ʈ�������� ����
        System.out.println(str);
        //��Ʈ�������� ���
        br.close();
        //���۵帮���� �ߴ��ؾ� ���� �Ȱɸ���        }
    }
}


