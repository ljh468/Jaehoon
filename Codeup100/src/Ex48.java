import java.util.Scanner;

public class Ex48 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int num = s.nextInt();
			
			if (num == 0) {
				break;
			}
			System.out.println(num);
		}
	}
}
