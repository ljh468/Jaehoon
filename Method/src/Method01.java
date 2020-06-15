
public class Method01 {

	public static void main(String[] args) {
		// 무조건 자바 시작할 때 샐행되는 첫번쨰 함수(메서드)
		System.out.println("main함수 호출시작!!");
		
		int res = sum(1,2);
		System.out.println("sum함수 실행결과 : "+res);
		System.out.println("main함수 호출 끝!!");
	}
	
		// main함수에서 호출되는 함수
	public static int sum(int i1, int i2) {
		System.out.println("sum함수 호출시작!!");
		
		int sum = 0;
		// 함수 sum 안에서만 사용하는 지역변수
		
		for(int i=i1; i<=i2; i++) {
			sum +=i;
		}
		// 첫번째 입력값부터 두번째 입력값까지의 합을 구하는 메소드
		System.out.println("sum함수 호출 끝!!");
		
		return sum;
		// void선언이 없으면 return값 필요
		// sum함수는 integer 타입으로 동일해야한다
		
	}

}
