package inflearn;

import java.util.Scanner;

//문제
//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
//
//문장속의 각 단어는 공백으로 구분됩니다.
public class Main3 {
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;//가장 작은 값으로 먼저 준다

        String[] s = str.split(" "); //첫번째 방법
        for(String x : s){
            //System.out.println(x);//분리된 단어를 확인 할 수 있음 주석으로 막자
            int len = x.length();//단어 길이를 찾자
            if(len>m){
                m=len;
                answer = x;
            }
        }

        while((pos = str.indexOf(' '))!=-1){//두번째 방법
            String tmp = str.substring(0,pos);
            int len=tmp.length();
            if(len>m){//여기서 = 을 붙이면 뒤에서 찾는 애가 m이 되버림
                m = len;
                answer=tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>m)
            answer=str;

        return answer;
    }

    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();//문장을 받아야하니 nextline
        System.out.println(T.solution(str));
    }
}
