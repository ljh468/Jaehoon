import java.util.Arrays;

public class Ex05_05 {

	public static void main(String[] args) {
		int[] ball = new int[45];

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 45);
			System.out.println(num);
		}
		System.out.println(Arrays.toString(ball));

	}

}
