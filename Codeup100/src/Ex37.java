// �� ���� �Է¹޾� ���ϱ�2
import java.util.Scanner;

public class Ex37{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		s.close();
		
		if(num1<=num2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}

/* �� ���� �Է¹޾� ���ϱ�3
public class Ex37{
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	s.close();
	
	if(num1==num2) {
		System.out.println(1);
	}else {
		System.out.println(0);
	}
}
}
*/
/* ����2�� �Է¹޾Ƽ� �� 4
public class Ex37{
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	s.close();
	
	if(num1!=num2) {
		System.out.println(1);
	}else {
		System.out.println(0);
	}
}
}
*/