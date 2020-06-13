// º°Âï±â 01
import java.util.Scanner;

		public class Baekjoon26 {
			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				int k;
				for(int i=0; i<n; i++) {
					for(k=0; k<=i; k++) {
						System.out.printf("*");
					}
					System.out.println();
				}
				
				}
		}
