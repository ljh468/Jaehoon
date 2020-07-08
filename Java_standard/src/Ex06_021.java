// 1.설계도 2.데이터+함수 3.사용자정의타입

public class Ex06_021 {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();	
		
		t1.hour = 12;
		t1.minute = 34;
		t1.second = 56;
		t1.hourUp();
		System.out.println(t1.hour+"시"+ t1.minute+"분" + t1.second+"초");
	}
}
// 변수(서로관련있는 데이터) + 함수 (명령문 묶음)
// 시,분,초를 하나로 묶음
class Time{
	int hour;
	int minute;
	int second;
	
	void hourUp(){
		++hour;
	}
}