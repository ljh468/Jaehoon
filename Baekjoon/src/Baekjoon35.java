//º°Âï±â 03
import java.util.Scanner;

public class Baekjoon35 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i;
		int k;
		
		for(i = 0; i<n; i++) {
			for(k=0; k<=i; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		for(i = 0; i<n-1; i++) {
			for(k=n-1; k>i; k--) {
				System.out.printf("*");
			}
			System.out.println();
		}
			
	}
}
