// ���̾�
import java.util.Scanner;

public class Baekjoon55 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		int time = 0; // �ð��ʱ�ȭ
		int len = str.length();
		
		// ���ڿ� �ϳ��ϳ� üũ
		for(int i = 0; i < len; i++) {
			
			switch(str.charAt(i)) {
			
	
			case 'A' : case 'B' : case'C' :
				time += 3; // 1�� 2�ʰɸ��� 2�� 3��!! ���� �������� 1������ �Ͽ� �ɸ���
				break;
				
			case 'D' : case 'E' : case'F' :
				time += 4; // 4��
				break;
				
			case 'G' : case 'H' : case'I' :
				time += 5; // 5��
				break;
				
			case 'J' : case 'K' : case'L' :
				time += 6; // 6��
				break;
				
			case 'M' : case 'N' : case'O' :
				time += 7; // 7��
				break;
				
			case 'P' : case 'Q' : case'R' : case'S' :
				time += 8; //8��
				break;
				
			case 'T' : case 'U' : case'V' :
				time += 9; // 9��
				break;
				
			case 'W' : case 'X' : case'Y' : case'Z' :
				time += 10; // 10��
				break;
			}
		}
		System.out.println(time);
	}
}