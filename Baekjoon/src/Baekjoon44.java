import java.util.Scanner;

public class Baekjoon44 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = s.nextInt(); // 케이스수
		int n = 0; // 학생수
		double avg = 0; // 평균점수
		int[] arr = new int[1000];
		
		
		// 케이스 수 확인
		for (int i = 0; i < c; i++) {
			n = s.nextInt();
			int sum = 0; // 합계 한번 돌때마다 초기화
			int num = 0; // 평균넘는 학생수 한번 돌때마다 초기화

			for (int j = 0; j < n; j++) { // 입력 반복문
				arr[j] = s.nextInt();
				sum += arr[j]; // 합계구하기
			}
			avg = (double)sum / n; // 평균구하기

			for (int j = 0; j < n; j++) { // 학생수 세기
				if (arr[j] > avg) {
					num++;
				}
			}
			System.out.printf("%.3f%%\n", 100.0 * num / n);
			
		}
		s.close();
	}
}