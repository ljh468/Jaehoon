import java.util.Scanner;
public class Ex04_15_dowhile {

	public static void main(String[] args) {
		int input = 0;
		int answer = (int)(Math.random() * 100)+1;
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("1~100사이의 정수를 입력하세요");
			input = s.nextInt();
			
			if(input>answer) {
				System.out.println("작은값으로 다시 시도하세요");
			}
			else if(input<answer) {
				System.out.println("큰값으로 다시 시도하세요");
			}
		}while(input!=answer);
		System.out.println("정답입니다.");
	}

}
