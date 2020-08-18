// 상수 거꾸로 수 비교
import java.util.Scanner;

public class Baekjoon54 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		
		int num1 = revers(a); 
		int num2 = revers(b);
		
		if(num1>num2) { // num1이 num2보다 크면 num1출력, 아니면 num2출력
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	
	public static int revers(int num) { // 숫자를 거꾸로 바꾸기위한 revers 함수
		String str = String.valueOf(num); //int로 받아온 숫자를 문자열로 변경
		String r = "";
		for(int i=str.length(); i>0; i--) { //str문자열을 거꾸로 넣기위한 for문 
			r += str.charAt(i-1);
		}
		return Integer.parseInt(r); // return값을 int형으로 변경
	}
}