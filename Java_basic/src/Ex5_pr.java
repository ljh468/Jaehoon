import java.util.Scanner;
public class Ex5_pr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("ó���� ���� �Է��ϼ���");
			float a = sc.nextFloat();
			
			if(a==0) {
				System.out.printf("�Է��� ���� 0 �Դϴ�.");
			}
			else if(a<0) {
				System.out.printf("�Է��Ѽ��� - �Դϴ�.");
			}
			else if(a>0) {
				System.out.printf("�Է��Ѽ���  + �Դϴ�.");
			}
		
	}

}
