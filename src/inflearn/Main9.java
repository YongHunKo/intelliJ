package inflearn;

import java.util.Scanner;

public class Main9 {
    public int solution(String s){
        int answer = 0;
        for(char x:s.toCharArray()){
            if(x>=48&&x<=57)
                answer=answer*10+(x-48);
        } //���1 asc�� ǥ���Ͽ� �ڸ��� ���ϱ�

//        String answer = "";
//        for(char x:s.toCharArray()){
//            if(Character.isDigit(x))
//                answer+=x;
//        }//���2 �״�� �����Ͽ� ���ϱ� �̹���� ����Ҷ� �ۺ��� string���� �ٲ��ֱ� �Ǵ� �������� �ٶ� Integer.parserInt(answer)�� ��������ȯ

        return answer;
    }

    public static void main(String[] args) {
        Main9 T = new Main9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
