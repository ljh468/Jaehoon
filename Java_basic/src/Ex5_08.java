import java.util.Scanner;

public class Ex5_08 {

	public static void main(String[] args) {

		int score;
		char grade=' ';
		char opt='0';

		Scanner sc=new Scanner(System.in);
		System.out.printf("������ �Է��ϼ���\n");
		score = sc.nextInt();

		if(score>=90) {
			grade = 'A';
			if(score>=97) {
				opt = '+';
			}
			else if(score<94) {
				opt ='-';
			}

		}
		else if(score>=80) {
			grade='B';
			if(score>=87) {
				opt='+';
			}
			else if(score<84) {
				opt='-';
			}
			
		}
		else if(score>=70) {
			grade='C';
			if(score>=77) {
				opt='+';
			}
			else if(score<74) {
				opt='-';
			}
		}
		else if(score>=60) {
			grade='D';
			if(score>=67) {
				opt='+';
			}
			else if(score<64) {
				opt='-';
			}
		}
		else
			grade='F';
		
		System.out.printf("����� ������ %c%c�Դϴ�.",grade,opt);
		
	}
}
