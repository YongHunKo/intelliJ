package exam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//로또
public class backjoon6603 {
    // 최종적으로는 k개의 수가 있는 배열s에서 depth 6인 경우를 다 출력하라는 문제
    static int k;
    //우리가 고를 숫자의 수
    static int [] s;
    //우리가 고를 숫자의 배열
    static boolean [] chk;
    //사용한 숫자를 체크하기 위한 불린
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String testCase=br.readLine();
            if(testCase.equals("0")) break;
            String [] input=testCase.split(" ");
            k=Integer.parseInt(input[0]);
            s=new int[k];
            chk=new boolean[k];
            for(int i=0;i<k;i++){
                s[i]=Integer.parseInt(input[i+1]);
            } //초기 값 세팅

            dfs(0,0);
            System.out.println();
        }
    }

    public static void dfs(int depth,int start){
        if(depth==6){
            for(int i=0;i<k;i++){
                if(chk[i]){
                    System.out.print(s[i]+" ");
                }
            }
            System.out.println();
        }
        for(int i=start;i<k;i++){
            chk[i]=true;
            dfs(depth+1,i+1);
            // 체크를 해서 갔던 곳이면 다음 배열의 숫자를 불러와서 돌린다
            // 주어진 수가 {1, 2, 3, 4, 5, 6, 7}이고
            // {1, 2, 3, 4, 5, 6} 이면
            // 이 과정을 거친 후엔
            // {1, 2, 3, 4 ,5, 7} 이 된다
            chk[i]=false;
        }
    }
}
