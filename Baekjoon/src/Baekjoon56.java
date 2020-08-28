// 크로아티아 알파벳 찾기
import java.util.Scanner;

public class Baekjoon56 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] ap = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String str = s.next();
		for(int i = 0; i < ap.length; i++) {
			str = str.replace(ap[i], "i"); // 크로아티아알파벳을 i로바꾼다
					
		}
		System.out.println(str.length()); // 알파벳숫자를 센다
	}
}