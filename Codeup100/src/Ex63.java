// [기초-1차원배열] 이상한 출석 번호 부르기2(설명)
import java.util.Scanner;

public class Ex63 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int[] boy = new int[count];
		int numbers = 0;
		for (int i = 0; i < count; i++) {
			numbers = sc.nextInt();
			boy[i] = numbers;
		}
		
		for (int j = boy.length -1; j >= 0; j--) {
			System.out.println( boy[j]);
		}
		
	}
	
}