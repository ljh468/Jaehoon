// �� ���� �Է¹޾� ���ϱ�
import java.util.Scanner;

public class Ex36{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		s.close();
		
		if(num1>num2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}

/*
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int num = s.nextInt();
int num2 = s.nextInt();
s.close();

 // ���� a�� �� ��Ʈ�� b��ŭ �������� �̵�(���ڸ��� 0���� ä������)
 // num �� 2��num2��ŭ ���Ѱ� ���
System.out.println(num<<num2);
}
*/