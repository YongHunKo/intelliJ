package exam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class backjoon2178 {
// ��
    static int n;
    static int m;
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());// ��
        m = Integer.parseInt(st.nextToken());// ��

        arr = new int[n][m]; // �̷� ����ũ�⸦ n m �ʱ��Է� �ΰ��� ����
        visited = new boolean[n][m]; // �湮 ����->������ �ִ� ���� �̹Ƿ� boolean
        visited[0][0] = true;

        for (int i = 0; i < n; i++) { // ���� ����
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        bfs(0, 0);
        System.out.println(arr[n - 1][m - 1]);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { x, y });

        // �̵� �� �� �ִ� ���� ��, ��������
        int[] dx = { 1, 0, -1, 0 };
        int[] dy = { 0, 1, 0, -1 };

        while (!q.isEmpty()) { // ť�� �� ��ǥ Ž���� ��� ���� ������ �ݺ�
            int[] xy = q.poll();

            for (int i = 0; i < 4; i++) { // ��, ��, ��, �� Ž��
                int nextX = xy[0] + dx[i];
                int nextY = xy[1] + dy[i];

                // ���� ������ �̷θ� ����ų�, ���̰ų�, �̹� Ž���� �� ��ǥ�̸� ����
                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m || visited[nextX][nextY]
                        || arr[nextX][nextY] == 0) {
                    continue;
                }

                // ���� Ž�� ������ ť�� �߰�
                q.add(new int[] { nextX, nextY });

                // ���� Ž�� ���� Ž��ó��
                visited[nextX][nextY] = true;

                // ���� Ž�� ������ ����� ���� ��ǥ + 1 �� ����
                arr[nextX][nextY] = arr[xy[0]][xy[1]] + 1;
            }
        }
    }
}