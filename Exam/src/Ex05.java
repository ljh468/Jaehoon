import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) {

		List <String> rList = new ArrayList<>();
		rList.add("�ڹ����α׷��ֺ���");
		rList.add("��Ȱ�ڵ�");
		rList.add("�ڹ�������������");
		rList.add("�ڹ�������3��");
		
		int i = 0;
		Iterator<String> it = rList.iterator();
		while(it.hasNext()){
			String str = it.next();
					if(i==0) {
					System.out.println("/"+str+"/");
					}
					else {
					System.out.println(str);
					}
					i++;
		}
		
		}
}
