//객체의 생성과 사용

//자바 소스파일의 이름과 메인클래스의 이름은 같아야한다.
public class Ex06_01 {

	public static void main(String[] args) {
		Tv t;				// Tv인스턴스를 참조하기위한 변수 t선언(리모컨생성)
		t = new Tv();		// Tv인스턴스를 생성 (객체를생성)
		t.channel = 7;		// 맴버변수 channel의 값에 7을 넣는다.
		t.channelDown();	// 매서드 channelDown()을 호출한다.
		System.out.println("현재채널은 "+ t.channel + " 입니다.");
	}
}
class Tv {
	//Tv의 속성(맴버변수)
	String color;		//색상
	boolean power;		//전원상태(on/off)
	int channel;		//채널

	// Tv의 기능 메서드
	void power() {power = !power;}	// Tv를 켜거나 끄는 기능을 하는 메서드
	void channelUp() {++channel;}	// 채널을 높이는 기능을하는 매서드
	void channelDown() {--channel;} // 채널을 낮추는 기능을하는 매서드
}