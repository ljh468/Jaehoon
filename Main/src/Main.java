import java.util.*;

class Main {
	public static void main(String[] a) {
		Scanner c = new Scanner(System.in);
		int k = c.nextInt(), n = c.nextInt(), b = n, s = n, i = 1;
		for (; i < k; i++) {
			n = c.nextInt();
			b = n > b ? n : b;
			s = n > s ? s : n;
		}
		System.out.print(s + " " + b);
	}
}