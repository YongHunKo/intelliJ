package inflearn;

import java.util.Scanner;
//����
//�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���
public class Main2 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x))//x�� ��ҹ��ڸ� Ȯ���ؾ���
                answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
