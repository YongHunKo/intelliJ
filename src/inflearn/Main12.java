package inflearn;

import java.util.Scanner;

public class Main12 {
    public String solution(int N, String s){
        String answer = "";
        for(int i=0; i<N; i++){
            String tmp = s.substring(0,7).replace('#','1').replace('*','0');//2진법 변환
            int num = Integer.parseInt(tmp, 2); //2진수 -> 10진수
            answer+=(char)num; //10진수 나온 것을 ASCII 문자로 변환
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
