// a,b,c �� ū�� ��� 3�� ������
import java.util.Scanner;

public class Ex44 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();
	
	System.out.println((a < b ? a : b) < c ? (a < b ? a : b) : c);
	}
}

