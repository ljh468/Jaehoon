// �ڵ�� ���� 100�� �Ϸ�
import java.util.Scanner;

public class Ex68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ���̱� ���� �Է¹ް� ����
        int[][] antCave = new int[10][10];
        for(int i = 0; i < 10; i++) {
            String caveInput = sc.nextLine();
            String[] caveInputSplit = caveInput.split(" ");
            for(int j = 0; j < 10; j++) {
                antCave[i][j] = Integer.parseInt(caveInputSplit[j]);
            }
        }

        int[][] antPath;
        antPath = antCave;

        // ���� ��� ǥ��
        boolean isReached = false;
        int x,y;
        x = 1; y = 1;
        while(!isReached) {
            if(antPath[x][y + 1] == 1) { // �������� ���� ���
                if(antPath[x + 1][y] == 1) { // �������� ������ �� �Ʒ��ʵ� ���� ���(����)
                    break;
                } 
                else { // �Ʒ����� ���� ���, 0 �Ǵ� 2
                    x++;
                }
            } 
            else if(antPath[x][y + 1] != 1) { // �������� 0 �Ǵ� 2 }
                y++;
            }
            if(antPath[x][y] == 2) { // ����
                    isReached = true;
            }
            antPath[x][y] = 9;
        }

        antPath[1][1] = 9; // ������ ��ũ

        // ���̱� ���
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(antPath[i][j] + " ");
            }
            System.out.println("");
        }
    }
}