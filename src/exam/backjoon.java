package exam;

import java.util.Scanner;

public class backjoon {//코드에 N이 40이고 우리는 0,1 두가지만 쓰니 2차원배열 사용
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int T = sc.nextInt();// 첫번째 입력으로는 우리가 while을 돌릴 횟수. 초과시 while탈출

        while (T--> 0) {
            int N = sc.nextInt();// 두번째 입력은 해당 피보나치수가 나옴
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
