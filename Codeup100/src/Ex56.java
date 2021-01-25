import java.util.Scanner;

public class Ex56 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long h = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();
		long d = s.nextLong();
		double total = 0;

		total = h * b * c * d;

		double result = ((total / 8) / Math.pow(2, 10) / Math.pow(2, 10));
		System.out.format("%.1f MB", result);
	}
}
