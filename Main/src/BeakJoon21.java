import java.util.Scanner;

public class BeakJoon21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=0;
		while(i<n) {
			System.out.println(n-i);
			i++;
		}
	}
}