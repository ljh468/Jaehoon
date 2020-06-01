
public class Test01 {

	public static void main(String[] args) {

		int i;
		int j;
		for (i = 3; i <= 8; i++) {
			if (i == 3) {
				System.out.println("<" + i + ">");
			} else if (i == 5) {
				System.out.println("<" + i + ">");
			}

			for (j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i + j));
			}
			System.out.println("");
		}

	}
}
