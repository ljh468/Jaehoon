import java.util.Scanner;

public class Mid {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt() ;
		s.close();
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		for(i=0; i<n-3; i++) {
			for(j=n-4; j>i; j--) {
				System.out.printf(" ");
			}
			for(k=0; k<i+1; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		for(i=0; i<n-4; i++) {
			for(j=0; j<i+1; j++) {
				System.out.printf(" ");
			}
			for(k=n-4; k>i; k--) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
	}
}
