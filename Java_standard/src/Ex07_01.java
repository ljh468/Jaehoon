class Tv2{
	boolean power; // 전원상태 on/off
	int channel; // 채널
	
	void power() { power = !power;}
	void channelup() { ++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv2{ // CaptionTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption; // 캡션상태 on/off
	void displayCaption(String text) {
		if(caption) { // 캡션상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}
public class Ex07_01 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel =10;	// 조상클래스로부터 상속받은 멤버
		ctv.channelup();	// 조상클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true; // 캡션 기능을 켠다.
		ctv.displayCaption("Hello, World");
	}

}
