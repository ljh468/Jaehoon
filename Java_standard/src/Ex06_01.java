//��ü�� ������ ���

//�ڹ� �ҽ������� �̸��� ����Ŭ������ �̸��� ���ƾ��Ѵ�.
public class Ex06_01 {

	public static void main(String[] args) {
		Tv t;				// Tv�ν��Ͻ��� �����ϱ����� ���� t����(����������)
		t = new Tv();		// Tv�ν��Ͻ��� ���� (��ü������)
		t.channel = 7;		// �ɹ����� channel�� ���� 7�� �ִ´�.
		t.channelDown();	// �ż��� channelDown()�� ȣ���Ѵ�.
		System.out.println("����ä���� "+ t.channel + " �Դϴ�.");
	}
}
class Tv {
	//Tv�� �Ӽ�(�ɹ�����)
	String color;		//����
	boolean power;		//��������(on/off)
	int channel;		//ä��

	// Tv�� ��� �޼���
	void power() {power = !power;}	// Tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() {++channel;}	// ä���� ���̴� ������ϴ� �ż���
	void channelDown() {--channel;} // ä���� ���ߴ� ������ϴ� �ż���
}