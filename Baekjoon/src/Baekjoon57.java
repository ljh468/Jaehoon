// ��1 ���ͺб���
import java.util.Scanner;

public class Baekjoon57 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();  // �������
		int b = s.nextInt();  // �������
		int c = s.nextInt();  // ��ǰ����
		// n = �Ǹŷ�
		// n * ��ǰ���� = ������� * (n * �������)
		// nc = a+nb  -> n(c-b) = a -> n = a/(c-b) 
		// n = a/(c-b) +1  //������ �� ���ͺб��� �׷��� +1 ������ �̵��� �Ǵ� ��ǰ������ ����
	
		if(c-b<=0) { // ��ǰ���ݺ��� ��������� ũ�� ������ �߻����� �ʴµ���
			System.out.println("-1");
		}else {
			System.out.println((a/(c-b))+1);
		}
	}
}