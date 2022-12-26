package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

//문제
//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
public class Main4 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString(); //모든 단어를 뒤집는 방법
            answer.add(tmp);

            char[] s = x.toCharArray(); //단어의 string이 char로 문자배열됨
            int lt = 0, rt = x.length()-1; //첫번째 배열과, 제일끝배열의 번호를 각각 lt, rt로 설정
            while(lt<rt){
                char tmp2=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp2;
                lt++;
                rt--; //3단계를 거쳐서 lt와 rt의 단어 자리를 바꾸고 배열의 번호를 +1, -1 해준다
            }
            String tmp2 = String.valueOf(s); //s를 String으로 바꿔주고 temp2로 저장하여 answer 배열에 담는다
            answer.add(tmp2);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner sc = new Scanner(System.in);//읽어들이고
        int n = sc.nextInt();//테스트 케이스 갯수를 입력 받는다
        String[] str = new String[n]; //입력할 단어를 string배열로 두고
        for(int i=0; i<n; i++){ //for문을 돌려 각 배열에 단어를 저장한다
            str[i]=sc.next();
        }
        for(String x : T.solution(n,str)){
            System.out.println(x);
        }
    }
}