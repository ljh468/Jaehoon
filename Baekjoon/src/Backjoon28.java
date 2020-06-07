import java.util.Scanner;

public class Backjoon28 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<x) {
				System.out.println(arr[i]);
			}
		}
		

	}
}
