package inflearn;

import java.util.Scanner;

//����
//�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//������� �� �ܾ�� �������� ���е˴ϴ�.
public class Main3 {
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;//���� ���� ������ ���� �ش�

        String[] s = str.split(" "); //ù��° ���
        for(String x : s){
            //System.out.println(x);//�и��� �ܾ Ȯ�� �� �� ���� �ּ����� ����
            int len = x.length();//�ܾ� ���̸� ã��
            if(len>m){
                m=len;
                answer = x;
            }
        }

        while((pos = str.indexOf(' '))!=-1){//�ι�° ���
            String tmp = str.substring(0,pos);
            int len=tmp.length();
            if(len>m){//���⼭ = �� ���̸� �ڿ��� ã�� �ְ� m�� �ǹ���
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
        String str = sc.nextLine();//������ �޾ƾ��ϴ� nextline
        System.out.println(T.solution(str));
    }
}
