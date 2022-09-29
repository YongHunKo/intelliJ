package exam;
import java.util.Queue;
import java.util.LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//ī��2
public class backjoon2164 {
    //Queue ��� ���� �˰� �ִ����� ���� ����
    //�������� �ڷᰡ ���� ���� ������ �˰��� (FIFO)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //���۵帮���� �Է��� �ް�
        Queue<Integer> q = new LinkedList<>();
        //ť�� ��ũ�帮��Ʈ�� ��´�
        int N = Integer.parseInt(br.readLine());
        //�Է¹��� ���� N�� ���
        for(int i = 1; i <= N; i++) {
            q.offer(i); //Queue�� �ڷḦ �Է��ϴ� ��ɾ� 'offer'
        }
        //�Է¹��� N��ŭ for���� ���� ť�� �����Ѵ�
        //6 �Է½� Queue ���ο� 1,2,3,4,5,6 ������� �ڷᰡ �Էµ�

        while(q.size() > 1) { //�������� �� �տ� ����� ���� ������ �״����� �ڷ� ������� ������
            q.poll();	// Queue�� �ڷḦ ������ ��ɾ� 'poll'
                        // ���� �� ���� ���Ҹ� ����
            q.offer(q.poll());	// �� ���� ���Ҹ� ������ ���ÿ� ������ ���Ҹ� �� �ڿ� ����
        }
        //Queue�� ���̸�ŭ while�� ���� �ش��۾� �ݺ��ϰ�

        System.out.println(q.poll());	// ���������� ���� ���� ���
    }
}       // �츮�� �˰Ե� ��--> Queue�� ���, FIFO��� �ܾ�
        // stack - push, pop
        // queue - offer, poll