import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Arraylist02 {

	public static void main(String[] args) {
		// List �������̽��� �޸𸮿� �ø��� ���� ������ ArrayList Ŭ������ ���� �޸𸮸� �ø�
		List<String> rList = new ArrayList<>();
		
		//List �÷��� �����ӿ�ũ�� �����͸� �߰���
		rList.add("������");
		rList.add("ȫ�浿");
		rList.add("�Ӳ���");
		rList.add("��浿");
		
		
		
		//�迭ũ�� ���
		System.out.println("�迭��ũ�� "+ rList.size());
		
		for(int i = 0; i<rList.size(); i++) {
			System.out.println("["+i+"]��° �迭 ������ : " + rList.get(i));
		}
		
		//List �÷����� ���� ����� �����͸� �����ö� for���� �����ʰ�, while ���� ������
		Iterator<String> it = rList.iterator(); // iterator �迭������ ����
		while(it.hasNext()) {  //hasNext�� �����Ͱ� ������ True ������ False
			String name = (String) it.next(); // �迭 �̵�
			
			System.out.println("�̸� : "+ name);
		}
	}

}
