import java.util.Scanner;

public class Ex04_05_ifelse {

	public static void main(String[] args) {
		int score = 0;
		char grade=' ';
		int opt='0';
		
		System.out.println("������ �Է����ּ���.>");
		
		Scanner s = new Scanner(System.in);
		score = s.nextInt();
		
		System.out.printf("����� ������ %d�Դϴ�.\n",score);
		
		if(score>=90){
			grade='A';
			if(score>=98){
				opt='+';
			} else if(score < 94) {
				opt='-';
			}
				
		} else if(score >= 80){
			grade='B';
			if(score>=88) {
				opt='+';
			} else if(score < 84) {
				opt='-';
			}
			
			
		}else {
			grade='C';
		}
		System.out.printf("����� ������ %c%c�Դϴ�\n",grade,opt);
	}

}
