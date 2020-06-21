//배열을 이용하여 최대,최소 구하기
import java.util.Scanner;

public class Baekjoon38 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			else if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min+" "+max);
	}
}
/*
 import java.util.*;

public class Baekjoon38 {
	public static void main(String[] a) {
		Scanner c = new Scanner(System.in);
		int k = c.nextInt(), n = c.nextInt(), b = n, s = n, i = 1;
		for (; i < k; i++) {
			n = c.nextInt();
			b = n > b ? n : b;
			s = n > s ? s : n;
		}
		System.out.print(s + " " + b);
	}
}
 */