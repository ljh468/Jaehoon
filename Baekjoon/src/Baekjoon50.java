// ¾ËÆÄºª Ã£±â
import java.util.Scanner;

public class Baekjoon50 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[26];
		for(int i=0; i<num.length;i++) {
			num[i] = -1;
		}
		
		String abc = s.nextLine();
		
		for(int i=0; i<abc.length(); i++) {
			char c = abc.charAt(i);
			if(num[c -'a']== -1) {
				num[c - 'a'] = i;
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
}