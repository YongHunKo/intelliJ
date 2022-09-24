package exam;
// ��
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//DFS, https://lotuus.tistory.com/89
public class backjoon2606_1 {
    static int count;
    static int computers;
    // ��ǻ�� ����
    static int pairs;
    // ��Ʈ��ũ�� ����Ǿ� �ִ� ��ǻ�� ���� ��
    static boolean[] check;
    // ������ �ļ�
    static int[][] node;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computers = Integer.parseInt(br.readLine());
        pairs = Integer.parseInt(br.readLine());

        count = -1;
        node = new int[computers +1][computers +1];
        check = new boolean[computers +1];
        for (int i = 0; i < pairs; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(),"");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node[a][b] = node[b][a] = 1;
        }
        dfs(1);
        System.out.println(count);
    }
    private static void dfs(int start){
        check[start] = true;
        // 1�� ��ǻ�� ���� ����
        count++;
        // +1
        // 1 2 3 5 6
        for (int i = 1; i<= computers; i++){
            // ��ǻ�� ������ŭ �����Ŵ�
            if(node[start][i]==1 && !check[i]) {
                //start�� 1����ǻ�Ϳ� ����� ����̸鼭, i�� ��ǻ�Ͱ� �������� �ʾҴٸ�
                dfs(i);
                //i�� ��ǻ�ʹ� ����ó���ؼ� dfs(i)�� ����
            }
        }
    }
}
