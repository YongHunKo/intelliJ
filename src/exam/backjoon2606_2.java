package exam;
// ��
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class backjoon2606_2 {
    static int[][] node;
    static boolean[] check;
    // ���� ���� Ȯ��
    static int count = 0;
    // ������ ��ǻ�� ��
    static Queue<Integer> q = new LinkedList<>();
    static int computers;
    static int pairs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computers = Integer.parseInt(br.readLine());
        pairs = Integer.parseInt(br.readLine());

        node = new int[computers+1][computers+1];
        check = new boolean[computers+1];
        for(int i = 0; i < pairs; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(),"");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node[a][b] = node[b][a] = 1;
            // 1, 2 �� 2, 1�� �����Ƿ� = ���⼺�� ����
        }
        bfs(1);
        // ��������� 1���� ȣ��ǰ�, ��带 Ž���ϸ鼭
        // ������ � ��带 Ž���� ������ q�� ����
        // ���� ��� Ž���� ������ q�� �����ص� ��带 ������ Ž��
        System.out.println(count);
    }

    // 1 2 5 3 6
    public static void bfs(int start){
        q.offer(start);
        check[start] = true;
        // 1�� ��ǻ�� = start
        while (!q.isEmpty()){
            int temp = q.poll();
            for(int i = 0; i <= computers; i++){
                if(node[temp][i]==1 && !check[i]){
                    q.offer(i);
                    check[i] = true;
                    count++;
                }
            }
        }
    }
}
