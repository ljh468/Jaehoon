//상근날드 입력받은값중 최소값찾기
import java.util.Scanner;

public class Baekjoon33 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int buger = 2001;
		int drink = 2001;

		for (int i = 0; i < 3; i++) {
			int bg = s.nextInt();
			if (bg < buger) {
				buger = bg;
			}
		}

		for (int i = 0; i < 2; i++) {
			int dr = s.nextInt();
			if (dr < drink) {
				drink = dr;
			}
		}
		System.out.println((buger + drink) - 50);
	}
}
