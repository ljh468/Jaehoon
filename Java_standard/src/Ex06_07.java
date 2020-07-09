// 참조형 매개변수
class Data2 { int x; }

public class Ex06_07 {

	public static void main(String[] args) {
		Data2 d = new Data2(); // Data2 인스턴스 생성
		d.x = 10;			 // Data2 인스턴스의 인스턴스변수 x에 10 저장
		System.out.println("main() : x = " + d.x);
		
		change(d);		 // change메서드에 d(주소값)참조변수를 넣음   //리모컨d를 저장
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data2 d) {	// 참조형 매개변수
		d.x = 1000;	// d가 가리키는 x변수에 1000대입
		System.out.println("change() : x = " + d.x);
	}
}

