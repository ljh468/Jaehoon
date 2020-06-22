import java.util.Scanner;

public class Baekjoon42 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		double[] arr = new double[n];
		double m = 0;
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();	
			if(arr[i]>m) {
				m = arr[i];
			}
		}
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (arr[i] / m) * 100;
			sum += arr[i];
		}
		double avg = (sum/n);
		System.out.println(avg);
	}
}