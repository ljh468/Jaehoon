class Tv2{
	boolean power; // �������� on/off
	int channel; // ä��
	
	void power() { power = !power;}
	void channelup() { ++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv2{ // CaptionTv�� Tv�� ĸ��(�ڸ�)�� �����ִ� ����� �߰�
	boolean caption; // ĸ�ǻ��� on/off
	void displayCaption(String text) {
		if(caption) { // ĸ�ǻ��°� on(true)�� ���� text�� ���� �ش�.
			System.out.println(text);
		}
	}
}
public class Ex07_01 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel =10;	// ����Ŭ�����κ��� ��ӹ��� ���
		ctv.channelup();	// ����Ŭ�����κ��� ��ӹ��� ���
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true; // ĸ�� ����� �Ҵ�.
		ctv.displayCaption("Hello, World");
	}

}
