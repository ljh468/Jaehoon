// ũ�ξ�Ƽ�� ���ĺ� ã��
import java.util.Scanner;

public class Baekjoon56 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] ap = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String str = s.next();
		for(int i = 0; i < ap.length; i++) {
			str = str.replace(ap[i], "i"); // ũ�ξ�Ƽ�ƾ��ĺ��� i�ιٲ۴�
					
		}
		System.out.println(str.length()); // ���ĺ����ڸ� ����
	}
}