package exam;
import java.io.*;
import java.util.*;
//�ܾ� ����
public class backjoon1339 {
    //���ĺ��鿡 ���ڸ� �ο��ؼ� �ִ밪�� ã�� �˰���
    public static int[] alpha = new int[26];
    //���ĺ��� 26���̹Ƿ� 26�� �迭
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //���۵帮���� �а�
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            int size = line.length();

            int base = (int) Math.pow(10, size - 1);

            for (int j = 0; j < size; j++) {
                alpha[line.charAt(j) - 'A'] += base;
                base /= 10;
            }
        }

        Arrays.sort(alpha);

        int ans = 0;

        for (int i = 25; i >= 17; i--) {
            ans += alpha[i] * (i - 16);
        }

        System.out.println(ans);


    }   //ABCD+ABC �� A*1100+B*110+C*11+D �� ǥ������
        //���� �ܾ �־����� ���ڿ��� ���ϴ� ���� ���ϰ�
        //������ ���� ū������ ū������ �ٲٴ� ��


}