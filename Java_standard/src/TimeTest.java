
class Time2 {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		// 0~23 �� ���̸� return1\
		if(isValidHour(hour)) return;
		
		this.hour = hour; // Ŭ������ hour �ν��Ͻ�����
	}
	
	// �Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼���
	private boolean isValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {return hour;}
	
}
public class TimeTest {

	public static void main(String[] args) {
		Time2 t = new Time2();
//		t.hour = -100; �������� ��������
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);;
		System.out.println(t.getHour());
	}

}
