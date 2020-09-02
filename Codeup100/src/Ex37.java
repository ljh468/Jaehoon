// 두 정수 입력받아 비교하기
import java.util.Scanner;

public class Ex37{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		s.close();
		
		if(num1==num2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
