//ArrayList ����
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Ex04 {

	public static void main(String[] args) {
		
		List <String> al = new ArrayList<>();
		
		al.add("��ü�������α׷�");
		al.add("�ϵ�");
		al.add("MongoDB");

		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			String str = it.next();
			if(str.equals("�ϵ�")) {
					System.out.println("<"+str+">");
			break;
			}
		
		}
		
		}
}
	

