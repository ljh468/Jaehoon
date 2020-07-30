// 한수 구하기 (1000이하 한수(등차수열을 이루는수))
import java.util.Scanner;

public class Baekjoon47 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(hansu(num));
	}

	public static int hansu(int num) {
		int count = 0;
		
		if(num <100) { // 100이하의 수는 모두 등차수열
			return num;
		}
		else {
			count = 99; // 100은 99개의 한수를 가지고 있음
			
			for(int i = 100; i<=num; i++) {
				int hundred = i / 100; // 100의자릿수
				int ten = i / 10 % 10; // 10의자릿수
				int one = i % 10; // 1의자릿수
				
				// 한수를 구하는 조건문(한수면 count를 +1)
				if((hundred - ten) == (ten - one)) {
					count++;
				}
			}
		}
		return count;
	}
}
