// 참조형 매개변수
class Data3 { int x; }

public class Ex06_08 {

	public static void main(String[] args) {
		Data3 d = new Data3(); // Data3 인스턴스 생성
		d.x = 10; 			   // d가 가리키는 x인스턴스변수에 10저장
		
		Data3 d2 = copy(d);    // 메서드를 static으로 선언했기때문에 객체생성없이 메서드호출가능
							   // copy 메스드에서 만든 인스턴스의 주소값을 d2에 저장
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	
	static Data3 copy(Data3 d) { // 참조형 매개변수 d(주소값)을 받음
		Data3 tmp = new Data3(); // Data3 인스턴스생성
		tmp.x = d.x;			 // tmp가 가리키는 x 인스턴스변수에 d.x의 값을 저장	
		return tmp;
	}
	
	
}

