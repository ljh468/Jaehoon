import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Arraylist03 {

	public static void main(String[] args) {
		List<String> rList = new ArrayList<>();
		
	
		rList.add("��ü�������α׷�");
		rList.add("�ϵ�");
		rList.add("MongoDB");		
		
		/*�迭ũ�� ���
		System.out.println("�迭��ũ�� "+ rList.size());
		
		for(int i = 0; i<rList.size(); i++) {
			System.out.println("["+i+"]��° �迭 ������ : " + rList.get(i));
		}*/
		
	
		int i=1;
		Iterator<String> it = rList.iterator();
		while(it.hasNext()) {
			String name = (String) it.next();
			if(i==3) {
				System.out.println("<"+name+">");
			}else
			System.out.println(name);
			i++;
		}
	}

}
