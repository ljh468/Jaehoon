// 정수 1개 입력받아 2배 곱해 출력
import java.util.Scanner;

public class Ex35{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		
		 //정수 a의 각 비트를 b만큼 왼쪽으로 이동(빈자리는 0으로 채워진다)
        System.out.println(num<<1);
	}
}

