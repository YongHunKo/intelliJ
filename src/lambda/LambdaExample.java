package lambda;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
    private static int[] scores = {10,50,3};

    public static int maxOrMin(IntBinaryOperator operator){
        int result = scores[0];
        for(int score : scores){
            result = operator.applyAsInt(result,score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(
                (a,b)->{
                    if(a>=b)
                        return a;
                    else return b;
                }//�ΰ��� �Ű����� �̿��Ͽ� if�� ������ ū���� ���

        );
        System.out.println("�ִ밪 : "+max);

        int min = maxOrMin(
                (a,b)->(a<=b)?a:b
                // ���׿�����
                // (���ǽ�)�� true �϶� �տ���, false �϶� �ڿ���
        );
    }
}
