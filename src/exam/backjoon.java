package exam;

import java.util.Scanner;

public class backjoon {//�ڵ忡 N�� 40�̰� �츮�� 0,1 �ΰ����� ���� 2�����迭 ���
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int T = sc.nextInt();// ù��° �Է����δ� �츮�� while�� ���� Ƚ��. �ʰ��� whileŻ��

        while (T--> 0) {
            int N = sc.nextInt();// �ι�° �Է��� �ش� �Ǻ���ġ���� ����
            f(N);
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
    }
    static Integer[] f(int N) {
        if (dp[N][0] == null || dp[N][1] == null) {
            dp[N][0] = f(N - 1)[0] + f(N - 2)[0];
            dp[N][1] = f(N - 1)[1] + f(N - 2)[1];
        }
        return dp[N];
    }
}
