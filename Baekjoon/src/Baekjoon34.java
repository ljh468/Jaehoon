//�Է��� ������ �ι�° ��� sort �̿�
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon34 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[3];
		int i = 0;
		while (i < arr.length) {
			arr[i] = s.nextInt();
			i++;
		}
		Arrays.sort(arr);
		System.out.println(arr[1]);

	}
}
