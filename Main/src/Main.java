import java.util.*;

public class Main {
	static int m, i, n;

	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		for (int j = 1; j <= 9; j++) {
			n = sc.nextInt();
			if (n > m) {
				m = n;
				i = j;
			}
		}
		System.out.print(m + "\n" + i);
	}
}
