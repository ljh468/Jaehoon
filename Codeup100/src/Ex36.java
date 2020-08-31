// 두 정수 입력받아 비교하기
import java.util.Scanner;

public class Ex36{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		s.close();
		
		if(num1>num2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}

/*
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int num = s.nextInt();
int num2 = s.nextInt();
s.close();

 // 정수 a의 각 비트를 b만큼 왼쪽으로 이동(빈자리는 0으로 채워진다)
 // num 을 2의num2만큼 곱한값 출력
System.out.println(num<<num2);
}
*/