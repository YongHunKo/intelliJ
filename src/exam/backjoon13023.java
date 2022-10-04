package exam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
//ABCDE -> ���� �غ�
public class backjoon13023 {
    // �� ������ DFS�� �̿��Ͽ� Ǯ�����
    // �ش� �б�� �� �� �ִ� ������ �� ���캸�� ������
    // https://minhamina.tistory.com/50
    static ArrayList<Integer>[] list;
    // ��̸���Ʈ�� �� ������ ����Ȱ� �������� ����
    static boolean[] visited;
    // �Դ� �������� �ݵ�� �Ǻ��ؾ��ϱ� ������ �Ҹ��� ������ ����
    static int N, M;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // �Է��ϴ� �κ�
        N = Integer.parseInt(st.nextToken());
        // �������� ��� �� ��� ����
        M = Integer.parseInt(st.nextToken());
        // ģ�������� ����� ����
        list = new ArrayList[N];
        for(int i=0; i<N; i++) {
            list[i] = new ArrayList<>();
            //��̸���Ʈ �迭�� N�� ������� �ִ´�
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            list[s].add(e);
            list[e].add(s);
            //������ �����ߵ��� 1->2�� ���� �Ͱ�
            // 2->1�� ���°� ���ٴ� ���� ������ ����Ѵ�
            // 1�̶� 2�� ���ʸ� ģ���� ����� ����..������..?
        }

        for(int i=0; i<N; i++) {
            visited = new boolean[N];
            // for���� ������ �� ������ �湮�ߴ��� �Ǵ����ϰ�
            visited[i] = true;
            // �湮�� �ߴ� ������ �Ҹ����� �Ǵ��ϰ�
            dfs(i, 0);
            //dfs�޼ҵ�� ���� ������ 4�ΰ�츸 ã�� 1�� ���
        }

        System.out.println(0);
        // �ƴѰ��� dfs�޼ҵ尡 ������ 0 ���
    }

    private static void dfs(int num, int depth) {
        if(depth == 4) {
            System.out.println(1);
            System.exit(0);
        }

        for(int i=0; i<list[num].size(); i++) {
            int nextNum = list[num].get(i);
            if(visited[nextNum]) continue;
            //��带 �޾ƿͼ� ��� �����Ű��
            visited[nextNum] = true;
            //���������� �湮�ߴ� ������ �Ҹ����� �Ǵ�
            dfs(nextNum, depth+1);
            //dfs�� nextNum���� �־� ������ 4���ɋ����� for���� �ݺ��Ͽ�
            //4�� �Ǹ� ������ 1�� ��µǾ� Ż��
            visited[nextNum] = false;
        }
    }
}