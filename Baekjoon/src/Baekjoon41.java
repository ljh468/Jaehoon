// 나머지 찾기 < 배열에 값을 나머지값을 넣고 for문으로 중복확인 >
import java.util.Scanner;

public class Baekjoon41 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt() % 42;
		}
		int count = 0;
		for (int i = 0; i < 10; i++) {
			int nul = 0;
			for (int j = i + 1; j < 10; j++) {

				if (arr[i] == arr[j]) {
					nul++;
				}
			}
			if (nul == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
/*
 * import java.util.Scanner; import java.util.HashSet;
 * 
 * public class Baekjoon41 {
 * 
 * public static void main(String[] args) { Scanner s = new Scanner(System.in);
 * HashSet<Integer> rSet = new HashSet<Integer>();
 * 
 * for (int i = 0; i < 10; i++) { rSet.add(s.nextInt() % 42); //입력받은 값의 나머지 값을
 * add메소드를 통해 HashSet에 저장 }
 * 
 * in.close(); System.out.print(rSet.size()); } }
 */