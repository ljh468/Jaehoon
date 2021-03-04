//  1098 : [����-2�����迭] �������� �̱�
import java.util.Scanner;

public class Ex67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sizeX = sc.nextInt();
        int sizeY = sc.nextInt();

        // �迭 ����
        int[][] arr = new int[sizeX][sizeY];

        int n = sc.nextInt();
        int l, d, x, y;

        // ���� ��ŭ �ݺ�
        for (int i = 0; i < n; i++) {
            l = sc.nextInt();
            d = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            // ������ ���� ���� ����
            if (d == 0) {
                for (int a = y; a < y + l; a++) {
                    arr[x - 1][a - 1] = 1;
                }
            } else {
                for (int a = x; a < x + l; a++) {
                    arr[a - 1][y - 1] = 1;
                }
            }

        }

        // �迭 ���
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}