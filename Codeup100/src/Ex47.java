// �򰡸� ����(A, B, C, D, ...)�� �Է¹޾� ������ �ٸ��� ����غ���.
import java.util.Scanner;

public class Ex47 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char st = s.next().charAt(0);
		
		switch(st) {
			case 'A':
				System.out.println("best!!!");
				break;
			case 'B':
				System.out.println("good!!");
				break;
			case 'C':
				System.out.println("run!");
				break;
			case 'D':
				System.out.println("slowly~");
				break;
			default:
				System.out.println("what?");
		}
	}
}
