package exam;
import java.util.Scanner;

public class backjoon1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a,b,result;
        for(int j=0;j<T;j++) { // 이거는 T만큼 하기위한 조건
            a=sc.nextInt();
            b=sc.nextInt();
            result=1;

            for (int i=0;i<b;i++) result=(result*a)%10; // a를 b번 곱하면 a^b랑 똑같다
            if(result==0) result=10;
            System.out.println(result);
        }
        sc.close();
    }
}