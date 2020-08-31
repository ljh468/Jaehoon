// 정수 2개를 입력받아 거듭제곱 배로 출력하기
import java.util.Scanner;

public class Ex36{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int num2 = s.nextInt();
		s.close();
		
		 //정수 a의 각 비트를 b만큼 왼쪽으로 이동(빈자리는 0으로 채워진다)
        System.out.println(num<<num2);
	}
}

