import java.util.Scanner;

public class Ex09_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.printf("문자열 입력 ==> ");
		str = s.nextLine();
		
		System.out.printf("출력문자열 ==> ");
		
		if(!str.startsWith("(")) {   // 문자열 시작이 "(" 가 아니면
			System.out.printf("(");  // "(" 출력
		}
		
		for(int i=0; i<str.length(); i++) {  //입력한 문자를 모두 출력
			System.out.printf("%c",str.charAt(i));
		}
		if(!str.endsWith(")")) {    // 문자열의 마지막이 ")"이 아니면
			System.out.printf(")"); // ")" 출력
		}
	}
}
