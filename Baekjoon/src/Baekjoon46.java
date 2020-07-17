// 셀프넘버
public class Baekjoon46 {
	public static void main(String[] args) {
		//10000이하에서 찾아야 함 
		int limit = 10000;
		boolean[] temp = new boolean[limit];
		for (int i = 1; i < limit; i++) {
			if (d(i) <= limit) {
				temp[d(i) - 1] = true;
			}
		}
		//셀프넘버를 출력
		for (int j = 0; j < 10000; j++) {
			if (!temp[j]) {
				System.out.println(j + 1);
			}
		}

	}
	// 셀프넘버를 찾기위한 함수 (n으로 d를 찾음
	public static int d(int n) {
		int d = n;
		while (n > 0) {
			d += n % 10;
			n /= 10;
		}
		return d;
	}
}