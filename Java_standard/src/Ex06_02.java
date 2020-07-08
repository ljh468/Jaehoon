//객체의 생성과 사용

//자바 소스파일의 이름과 메인클래스의 이름은 같아야한다.
public class Ex06_02 {

	public static void main(String[] args) {
		Tv t1 = new Tv();	// t1참조변수와 생성된 Tv객체를 연결 (Tv 객체주소값을 t1에 넣음)
		Tv t2 = new Tv();	// t2참조변수와 생성된 Tv객체를 연결 (Tv 객체주소값을 t2에 넣음)
		System.out.println("t1의 channel값은 " + t1.channel+"입니다.");
		System.out.println("t2의 channel값은 " + t2.channel+"입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		t2 = t1; //t1 주소값을 t2에 넣음
				 //t2는 t1과 연결된 객체와 연결됨
		
		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");
	}

}

