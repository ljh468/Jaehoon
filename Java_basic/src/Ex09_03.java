import java.util.Scanner;

public class Ex09_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.printf("���ڿ� �Է� ==> ");
		str = s.nextLine();
		
		System.out.printf("��¹��ڿ� ==> ");
		
		if(!str.startsWith("(")) {   // ���ڿ� ������ "(" �� �ƴϸ�
			System.out.printf("(");  // "(" ���
		}
		
		for(int i=0; i<str.length(); i++) {  //�Է��� ���ڸ� ��� ���
			System.out.printf("%c",str.charAt(i));
		}
		if(!str.endsWith(")")) {    // ���ڿ��� �������� ")"�� �ƴϸ�
			System.out.printf(")"); // ")" ���
		}
	}
}
