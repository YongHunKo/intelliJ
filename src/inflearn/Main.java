package inflearn;

import java.util.Scanner;
//����
//�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
//ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
//
//���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
public class Main {
    public int solution(String str, char t){
        int answer=0;
        str = str.toUpperCase();//3. ���� �빮�ڷ� ��������
        t = Character.toUpperCase(t);//4. ���������� �빮�ڷ�
        System.out.println(str+" "+t);// 5. �빮�ڷ� �ٲ�� Ȯ��
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)==t) //6. �ε����� �����ϴ� ���
//                answer++;
//        }
//
//        return answer;

        for(char x : str.toCharArray())//string�� ���ڹ迭�� ��Ÿ���� ���
            if(x==t)
                answer++;

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();//1.�о���̰�
        char c = sc.next().charAt(0);//2.���� �ϳ��� �����;���

        System.out.println(T.solution(str, c));
    }
}// ���α׷��ӽ� ��� = solution ���
