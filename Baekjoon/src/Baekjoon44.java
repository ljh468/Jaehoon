import java.util.Scanner;

public class Baekjoon44 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[s.nextInt()];
		int hap = 0;
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < arr.length; k++) {
				arr[k] = s.nextInt();
				hap += arr[k];
			}
			double avg = hap / arr.length;
			int num = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[j] > avg) {
					num++;
				}
			}
			double result = (double)avg/num * 100;
			System.out.printf("%.3f", result);
			System.out.println("%");
		}
		s.close();
	}
}
