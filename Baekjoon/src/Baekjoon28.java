// x���� ������ ��� (n���� �̷���� �迭, for, if�̿�)
import java.util.Scanner;

public class Baekjoon28 {
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
				System.out.printf("%d ",arr[i]);
			}
		}
		

	}
}
