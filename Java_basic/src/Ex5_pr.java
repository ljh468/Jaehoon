import java.util.Scanner;
public class Ex5_pr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("처리할 수를 입력하세요");
			float a = sc.nextFloat();
			
			if(a==0) {
				System.out.printf("입력한 수는 0 입니다.");
			}
			else if(a<0) {
				System.out.printf("입력한수는 - 입니다.");
			}
			else if(a>0) {
				System.out.printf("입력한수는  + 입니다.");
			}
		
	}

}
