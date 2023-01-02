package inflearn;

import java.util.Scanner;

public class Main9 {
    public int solution(String s){
        int answer = 0;
        for(char x:s.toCharArray()){
            if(x>=48&&x<=57)
                answer=answer*10+(x-48);
        } //방법1 asc로 표현하여 자리수 더하기

//        String answer = "";
//        for(char x:s.toCharArray()){
//            if(Character.isDigit(x))
//                answer+=x;
//        }//방법2 그대로 추출하여 더하기 이방법을 사용할땐 퍼블릭도 string으로 바꿔주기 또는 리턴으로 줄때 Integer.parserInt(answer)로 강제형변환

        return answer;
    }

    public static void main(String[] args) {
        Main9 T = new Main9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
