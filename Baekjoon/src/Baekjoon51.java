// �ܾ����
import java.util.Scanner;

public class Baekjoon51 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine().toUpperCase();
		
		int[] num = new int[26]; //���ĺ��� ���� �迭 ����
		int max = 0; // ���帹�� ���ڸ� �������� max����
		char res = '?'; // �������ڰ� ��ġ�� ��Ÿ���� res����
		
		for(int i = 0; i<str.length(); i++) {
			num[str.charAt(i) - 65]++; // ���ڿ�  0�ڸ����� ������� ��������
			if(max < num[str.charAt(i)-65]) { // �빮��A�� �ƽ�Ű�ڵ�� 65
				max = num[str.charAt(i)-65]; // 
				res = str.charAt(i);
			}else if (max == num[str.charAt(i)-65]) { //max�� �����ϸ� ��Ÿ���� ����
				res = '?';
			}
		}
		System.out.println(res);
		
	}
}