// a,b �� ū�� ��� 3�� ������
import java.util.Scanner;

public class Ex43 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	
	System.out.println(a > b ? a:b);
	}
}


/*
 ��Ʈ���� �������� XOR��� 00 0 01 1 11 0 10 1
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(a^b);
	}
*/