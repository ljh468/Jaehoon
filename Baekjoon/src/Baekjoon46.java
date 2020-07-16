// ¼¿ÇÁ³Ñ¹ö
public class Baekjoon46 {
	public static void main(String[] args) {
		int limit = 10000;
		boolean[] temp = new boolean[limit];
		for (int i = 1; i < limit; i++) {
			if (d(i) <= limit) {
				temp[d(i) - 1] = true;
			}
		}
		for (int j = 0; j < 10000; j++) {
			if (!temp[j]) {
				System.out.println(j + 1);
			}
		}

	}

	public static int d(int n) {
		int num = n;
		while (n > 0) {
			num += n % 10;
			n /= 10;
		}
		return num;
	}
}