// 1.���赵 2.������+�Լ� 3.���������Ÿ��

public class Ex06_021 {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();	
		
		t1.hour = 12;
		t1.minute = 34;
		t1.second = 56;
		t1.hourUp();
		System.out.println(t1.hour+"��"+ t1.minute+"��" + t1.second+"��");
	}
}
// ����(���ΰ����ִ� ������) + �Լ� (��ɹ� ����)
// ��,��,�ʸ� �ϳ��� ����
class Time{
	int hour;
	int minute;
	int second;
	
	void hourUp(){
		++hour;
	}
}