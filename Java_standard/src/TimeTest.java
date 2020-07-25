
class Time2 {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		// 0~23 의 값이면 return1\
		if(isValidHour(hour)) return;
		
		this.hour = hour; // 클래스의 hour 인스턴스변수
	}
	
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {return hour;}
	
}
public class TimeTest {

	public static void main(String[] args) {
		Time2 t = new Time2();
//		t.hour = -100; 범위밖의 직접접근
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);;
		System.out.println(t.getHour());
	}

}
