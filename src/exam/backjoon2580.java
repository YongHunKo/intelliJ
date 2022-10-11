package exam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//������
public class backjoon2580 {

    public static int[][] arr = new int[9][9];
    // 9X9 ����� �迭�� ǥ��

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // �־��� ������ �迭�� �� �ְ� ���Ͽ��� ���� [0][0]���� ��� ���Ʈ���������� ��ģ��
        sudoku(0, 0);
    }

    public static void sudoku(int row, int col) {

        // �ش� ���� �� ä������ ��� ���� ���� ù ��° ������ ����
        if (col == 9) {
            sudoku(row + 1, 0);
            return;
        }

        // ��� ���� ��� ä������ ��� ��� �� ����
        if (row == 9) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.println(sb);
            // ��� �� �ý����� �����Ѵ�.
            System.exit(0);
        }

        // ���� �ش� ��ġ�� ���� 0 �̶�� 1���� 9���� �� ������ �� Ž��
        if (arr[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                // i ���� �ߺ����� �ʴ��� �˻�
                if (possibility(row, col, i)) {
                    arr[row][col] = i;
                    sudoku(row, col + 1);
                }
            }
            arr[row][col] = 0;
            return;
        }

        sudoku(row, col + 1);

    }

    public static boolean possibility(int row, int col, int value) {

        // ���� �࿡ �ִ� ���ҵ� �� ��ġ�� �� ���Ұ� �ִ��� �˻�
        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == value) {
                return false;
            }
        }

        // ���� ���� �ִ� ���ҵ� �� ��ġ�� �� ���Ұ� �ִ��� �˻�
        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == value) {
                return false;
            }
        }

        // 3*3 ĭ�� �ߺ��Ǵ� ���Ұ� �ִ��� �˻�
        int set_row = (row / 3) * 3; // value�� ���� 3x3�� ���� ù ��ġ
        int set_col = (col / 3) * 3; // value�� ���� 3x3�� ���� ù ��ġ

        for (int i = set_row; i < set_row + 3; i++) {
            for (int j = set_col; j < set_col + 3; j++) {
                if (arr[i][j] == value) {
                    return false;
                }
            }
        }

        return true; // �ߺ��Ǵ� ���� ���� ��� true ��ȯ
    }

}