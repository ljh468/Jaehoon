import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {

		int i;
		int k;
		int j;

		for (i = 0; i < 4; i++) {
			for (k = 3; k > i; k--) {
				System.out.printf(" ");
			}
			for (j = 0; j < i + 1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

		for (i = 0; i < 3; i++) {
			for (k = 0; k < i + 1; k++) {
				System.out.printf(" ");
			}
			for (j = 3; j > i; j--) {
				System.out.printf("*");
			}
			System.out.println();

		}
	}
}
