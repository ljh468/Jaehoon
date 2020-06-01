
public class Test02 {
	public static void main(String[] args) {
		int i = 3;
		int j = 1;

		while (i <= 8) {
			if (i == 3 || i == 5) {
				System.out.println(i + "´Ü");
			}
			while (j <= 9) {
				System.out.println(i + "X" + j + "=" + (i * j));
				j++;
			}
			i++;
			j = 1;
			System.out.println();
		}

	}

}
