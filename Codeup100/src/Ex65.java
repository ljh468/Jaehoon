// [����-2�����迭] �ٵ��ǿ� �� �� ����(����)
import java.util.Scanner;

public class Ex65{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[19][19];
        int n = sc.nextInt();

        // �� ���� ����ŭ �ݺ�
        for (int i = 0; i < n; i++) {
            int whichx = sc.nextInt(); // x��ġ�� ����
            int whichy = sc.nextInt(); // y��ġ�� ����

			// x,y��ǥ�� 2���� �迭�� ǥ��
            for (int x = 0; x < arr.length; x++) {
                for (int y = 0; y < arr.length; y++) {
                    arr[whichx - 1][whichy - 1] = 1;
                }
            }
        }

		// ���
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

}

