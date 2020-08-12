// 단어공부
import java.util.Scanner;

public class Baekjoon51 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine().toUpperCase();
		
		int[] num = new int[26]; //알파벳을 넣을 배열 생성
		int max = 0; // 가장많은 문자를 세기위한 max변수
		char res = '?'; // 많은문자가 겹치면 나타내줄 res변수
		
		for(int i = 0; i<str.length(); i++) {
			num[str.charAt(i) - 65]++; // 문자열  0자리부터 순서대로 세기위함
			if(max < num[str.charAt(i)-65]) { // 대문자A의 아스키코드는 65
				max = num[str.charAt(i)-65]; // 
				res = str.charAt(i);
			}else if (max == num[str.charAt(i)-65]) { //max가 동일하면 나타내줄 조건
				res = '?';
			}
		}
		System.out.println(res);
		
	}
}