package exam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class backjoon2745 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int ans = 0;
        for (int i = 0; i < n.length(); i++){
            if ('0' <= n.charAt(i) && n.charAt(i) <= '9'){
                ans = ans*b + ((int)n.charAt(i) - (int)'0');
            }//10���� �Ʒ� �ΰ�� ǥ������ ���߱����� if
            else{
                ans = ans*b + ((int)n.charAt(i) - (int)'A' + 10);
            }//10�����̻��� �� �̻�ǵ��� ǥ��
        }
        System.out.println(ans);
    }
}