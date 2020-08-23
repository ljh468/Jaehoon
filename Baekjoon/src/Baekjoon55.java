// 다이얼
import java.util.Scanner;

public class Baekjoon55 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		int time = 0; // 시간초기화
		int len = str.length();
		
		// 문자열 하나하나 체크
		for(int i = 0; i < len; i++) {
			
			switch(str.charAt(i)) {
			
	
			case 'A' : case 'B' : case'C' :
				time += 3; // 1이 2초걸리면 2는 3초!! 숫자 증가마다 1씩증가 하여 걸린다
				break;
				
			case 'D' : case 'E' : case'F' :
				time += 4; // 4초
				break;
				
			case 'G' : case 'H' : case'I' :
				time += 5; // 5초
				break;
				
			case 'J' : case 'K' : case'L' :
				time += 6; // 6초
				break;
				
			case 'M' : case 'N' : case'O' :
				time += 7; // 7초
				break;
				
			case 'P' : case 'Q' : case'R' : case'S' :
				time += 8; //8초
				break;
				
			case 'T' : case 'U' : case'V' :
				time += 9; // 9초
				break;
				
			case 'W' : case 'X' : case'Y' : case'Z' :
				time += 10; // 10초
				break;
			}
		}
		System.out.println(time);
	}
}