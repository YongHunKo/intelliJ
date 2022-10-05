package exam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//�ζ�
public class backjoon6603 {
    // ���������δ� k���� ���� �ִ� �迭s���� depth 6�� ��츦 �� ����϶�� ����
    static int k;
    //�츮�� �� ������ ��
    static int [] s;
    //�츮�� �� ������ �迭
    static boolean [] chk;
    //����� ���ڸ� üũ�ϱ� ���� �Ҹ�
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
            } //�ʱ� �� ����

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
            // üũ�� �ؼ� ���� ���̸� ���� �迭�� ���ڸ� �ҷ��ͼ� ������
            // �־��� ���� {1, 2, 3, 4, 5, 6, 7}�̰�
            // {1, 2, 3, 4, 5, 6} �̸�
            // �� ������ ��ģ �Ŀ�
            // {1, 2, 3, 4 ,5, 7} �� �ȴ�
            chk[i]=false;
        }
    }
}
