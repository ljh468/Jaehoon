import java.util.Scanner;
public class Ex04_15_dowhile {

	public static void main(String[] args) {
		int input = 0;
		int answer = (int)(Math.random() * 100)+1;
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("1~100������ ������ �Է��ϼ���");
			input = s.nextInt();
			
			if(input>answer) {
				System.out.println("���������� �ٽ� �õ��ϼ���");
			}
			else if(input<answer) {
				System.out.println("ū������ �ٽ� �õ��ϼ���");
			}
		}while(input!=answer);
		System.out.println("�����Դϴ�.");
	}

}
