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
                }//두개의 매개값을 이용하여 if를 돌려서 큰값을 얻기

        );
        System.out.println("최대값 : "+max);

        int min = maxOrMin(
                (a,b)->(a<=b)?a:b
                // 삼항연산자
                // (조건식)이 true 일때 앞에값, false 일때 뒤에값
        );
    }
}
