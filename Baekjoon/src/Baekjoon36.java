//별찍기 모래시계
import java.util.Scanner;

public class Baekjoon36 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i;
		int j;
		int k;
		
		for(i=0; i<n; i++) {
			for(j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(k=0; k<(2*n-1)-(2*i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=0; i<n-1; i++) {
			for(j=0; j<(n-2)-i; j++) {
				System.out.print(" ");
			}
			for(k=0; k<3+(2*i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
