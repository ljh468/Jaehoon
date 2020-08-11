// 단어공부
import java.util.Scanner;

public class Baekjoon51 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine().toUpperCase();
		
		int[] num = new int[26];
		int max = 0;
		char res = '?';
		
		for(int i = 0; i<str.length(); i++) {
			num[str.charAt(i) - 'a']++;
			if(max < num[str.charAt(i)-'a']) {
				max = num[str.charAt(i)-'a'];
				res = str.charAt(i);
			}else if (max == num[str.charAt(i)-'a']) {
				res = '?';
			}
		}
		System.out.println(res);
		
	}
}