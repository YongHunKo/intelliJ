package inflearn;

import java.util.Scanner;

public class Main12 {
    public String solution(int N, String s){
        String answer = "";
        for(int i=0; i<N; i++){
            String tmp = s.substring(0,7).replace('#','1').replace('*','0');//2���� ��ȯ
            int num = Integer.parseInt(tmp, 2); //2���� -> 10����
            answer+=(char)num; //10���� ���� ���� ASCII ���ڷ� ��ȯ
            s=s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(N, str));
    }
}
