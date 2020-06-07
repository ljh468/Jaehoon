import java.util.Scanner;

public class Backjoon27 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i, k,j;

		for (i = 0; i < n; i++) {
			for (j = n-1; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

/*
for(i=0; i<6; i++) {
	for(j=5; j>i; j--) {
		System.out.printf(" ");
	}
	for(j=0; j<i+1; j++) {
		System.out.printf("*");
	}
	System.out.println();
}
*/