import java.util.Scanner;
// 1099 : [����-2�����迭] ������ ����
public class Ex68 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] plate = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				plate[i][j] = scan.nextInt();
			}
		}
		
		// �� �Ʒ� ���� �����ʿ� ������ ���, �� �̻� ������ �� ���� ���, ���̸� ã�� ��� END
		// �������̳� �Ʒ������θ� ���� �� �� ���� (x+1) or (y+1)
		// (2,2) ���� ����
		
		int x = 1;
		int y = 1;

		while (x < 10 && y < 10) {

			if (plate[1][1] == 2) {
				plate[1][1] = 9;
				break;
			} else {
				plate[1][1] = 9;
			}
			
			if (x < 10 && y+1 < 10 && plate[x][y+1] == 0) {
				plate[x][y+1] = 9;
				y++;
			} 
			else if (x < 10 && y+1 < 10 && plate[x][y+1] == 2) {
				plate[x][y+1] = 9;
				break;
			} 
			else if (x+1 < 10 && y < 10 && plate[x+1][y] == 0) {
				plate[x+1][y] = 9;
				x++;
			} 
			else if (x+1 < 10 && y < 10 && plate[x+1][y] == 2) {
				plate[x+1][y] = 9;
				break;
			} 
			else {
				break;
			}
			
		}
		
		
		for (int n = 0; n < 10; n++) {
			for (int m = 0; m < 10; m++) {
				System.out.printf("%d ", plate[n][m]);
			}
			System.out.println();
		}
		
	}
	
}