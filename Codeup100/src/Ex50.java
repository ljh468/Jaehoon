import java.util.Scanner;
// ���� 1�� �Է¹޾� ���ĺ� ����ϱ�(����)
public class Ex50 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char n = s.nextLine().charAt(0);
		
		char a = 'a';
		
		while(a<=n) {
			System.out.print(a+" ");
			a++;
		}
		
	}
}


/*
// ���� 1�� �Է¹޾� ī��Ʈ�ٿ� ����ϱ�2(����)
public class Ex50 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		while (true) {
			num--;
			System.out.println(num);
			if (num == 0) {

				break;
			}

		}
	}
} 
 */