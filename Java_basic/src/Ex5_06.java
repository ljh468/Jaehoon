import java.util.Scanner;
public class Ex5_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.printf("정수를 입력하세요 :");
		a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println("짝수를 입력했군요..");	
		}
		else {
			System.out.println("홀수를 입력했군요");
		}
		
		
	}
}
