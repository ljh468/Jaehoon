// ��1 ������� ����
import java.util.Scanner;

public class Baekjoon58 {
	public static void main(String[] args) {
		int suger = 0;
		int count = 0; 
		Scanner s = new Scanner(System.in);
		suger = s.nextInt();
		
		while(true) {
			if(suger%5==0) {
				System.out.println(suger/5+ count);
				// 5Ű�� ������ �� �¾� �������� break;
			break;
			}else if(suger<=1) {
				System.out.println(-1);
				// 4���Ǹ� 3���� ������ 1�� ���⶧���� ��Ȯ�ϰ� ������ ����
				break;
			}
			suger = suger-3;
			// 3Ű�� ������ ��� count�� �ϳ� �÷��ش�
			count++;
		}
		
	}
}