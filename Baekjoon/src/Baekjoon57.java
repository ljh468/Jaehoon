// 수1 손익분기점
import java.util.Scanner;

public class Baekjoon57 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();  // 고정비용
		int b = s.nextInt();  // 가변비용
		int c = s.nextInt();  // 상품가격
		// n = 판매량
		// n * 상품가격 = 고정비용 * (n * 가변비용)
		// nc = a+nb  -> n(c-b) = a -> n = a/(c-b) 
		// n = a/(c-b) +1  //같으면 딱 손익분기점 그래서 +1 을해줘 이득이 되는 상품개수를 구함
	
		if(c-b<=0) { // 상품가격보다 가변비용이 크면 이익은 발생하지 않는데ㅏ
			System.out.println("-1");
		}else {
			System.out.println((a/(c-b))+1);
		}
	}
}