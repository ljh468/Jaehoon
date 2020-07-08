
// 정수의 n개의 합 함수만들기
public class Baekjoon45 {
	public static void main(String[] args) {
	}
}

class Test {
	long sum(int[] a) {
		long hap = 0;
		for (int i = 0; i < a.length; i++) {
			hap += a[i];
		}
		return hap;
	}
}