import java.util.Scanner;

public class Ex09_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.println("���ڿ� �Է�==> ");
		str = s.nextLine();
		
		System.out.println("��� ���ڿ� ==>");
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='o') {
				System.out.printf("%c",'$');
			}
			else
				System.out.printf("%c", str.charAt(i));
		//str.length() ==0 ���ڿ��� ����
		//str.length() !=0 ���ڿ��� �ִ�
			
		/*	if(str.length()==0) {  
				System.out.println("yes");
			}else
				System.out.println("No");
				*/
		}
	}
}
