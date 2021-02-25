import java.util.Scanner;

public class Ex64{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int numbers = 0;
		int min = 0;
		for (int i = 0; i < count; i++) {
			numbers = sc.nextInt();
			
			if (i == 0) {
				min = numbers;
			} else if (min > numbers) {
				min = numbers;
			}
			
		}
		System.out.println(min);
		
	}
	
}