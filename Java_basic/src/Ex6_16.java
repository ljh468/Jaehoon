import java.util.Scanner;
public class Ex6_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int str_cnt;
		int i;
		
		System.out.printf("���ڸ� �Է� : ");
		str = sc.nextLine();
		
		System.out.printf("\n");
		System.out.printf("�Է��� ���ڿ� ==> %s\n",str);
		System.out.printf("��ȯ�� ���ڿ� ==>");
		
		str_cnt = str.length();
		
		for(i = str_cnt-1; i>=0; i--) {
			System.out.printf("%c",str.charAt(i));
		}
		
	}
	
	
}
