//º°Âï±â Â¦¼ö È¦¼ö (%³ª¸ÓÁö ÀÌ¿ë)
import java.util.Scanner;

public class Baekjoon37 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i<2*n; i++) {
			if(i%2==1) {
				for(int k=0; k<n; k++) {
					if(k%2==1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			else {
				for(int k=0; k<n; k++) {
					if(k%2==1) {
						System.out.print(" ");
					}
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}		
	}
}
