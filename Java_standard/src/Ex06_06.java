// 기본형 매개변수
class Data { int x; }

public class Ex06_06 {

	public static void main(String[] args) {
		Data d = new Data(); // Data 인스턴스 생성
		d.x = 10;			 // Data 인스턴스의 인스턴스변수 x에 10 저장
		System.out.println("main() : x = " + d.x);
		
		change(d.x);		 // change메서드에 d.x의 값을 인수로 넣음
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x); 
	}
								//기본형 매개변수
	static void change(int x) {	// change 메서드 선언
		x = 1000;	// 지역변수 x에 1000대입
		System.out.println("change() : x = " + x);
	}
}

