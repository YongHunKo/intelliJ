package exam;
// ��
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class backjoon1260 {

    static StringBuilder sb = new StringBuilder();
    static boolean[] check; // Ȯ���� �ߴ��� ���ߴ���
    static int[][] arr; //���� �������

    static int node, line, start;//���� �� ����, ������ ��������, ��ŸƮ�� ������

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start= Integer.parseInt(st.nextToken());

        arr = new int[node+1][node+1];//��ǥ�� �״�� �޾��ַ��� +1�� �����߰�
        check = new boolean[node+1];// �ʱⰪ�� false�� ��

        for(int i = 0 ; i < line ; i ++) {// ���� ������¸� arr�� �����Ѵ�
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] =  1;
        }

        dfs(start); //dfs�� ȣ���ϰ�
        sb.append("\n");//�ٹٲ��� ���� ��
        check = new boolean[node+1];//Ȯ�λ��¸� �ʱ�ȭ�ؼ� ���� ���� Ȯ���Ұ� �����

        bfs(start);

        System.out.println(sb);

    }
    public static void dfs(int start) {
        //�������� ������ �޾� Ȯ���ϰ� ��� �Ŀ� ���� �������� ã�� �������� �����ϸ鼭 �ݺ�
        check[start] = true;
        sb.append(start + " ");

        for(int i = 0 ; i <= node ; i++) {
            if(arr[start][i] == 1 && !check[i])
                //���� ���ٸ� i+1������ ������忡 ���� �ƴϸ� dfs(i)�� ����
                dfs(i);
        }

    }

    public static void bfs(int start) {
        q.add(start);
        check[start] = true;

        while(!q.isEmpty()) {
            //q�� ����ִ°��� Ȯ��, ����ִ°� Ȯ���ϰ� �� ����
            start = q.poll();
            sb.append(start + " ");

            for(int i = 1 ; i <= node ; i++) {
                if(arr[start][i] == 1 && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }


    }

}
