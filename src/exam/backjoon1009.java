package exam;
import java.util.Scanner;

public class backjoon1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a,b,result;
        for(int j=0;j<T;j++) { // �̰Ŵ� T��ŭ �ϱ����� ����
            a=sc.nextInt();
            b=sc.nextInt();
            result=1;

            for (int i=0;i<b;i++) result=(result*a)%10; // a�� b�� ���ϸ� a^b�� �Ȱ���
            if(result==0) result=10;
            System.out.println(result);
        }
        sc.close();
    }
}