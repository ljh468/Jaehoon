import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test04 {
	public static void main(String[] args) {
		List<String> rList = new ArrayList<>();
		rList.add("��ü�������α׷�");
		rList.add("�ϵ�");
		rList.add("MongoDB");
		
		int i=0;
		Iterator<String> it = rList.iterator();
		while(it.hasNext()) {
			String num = it.next();
//			if(i==0)
			if(num.equals("�ϵ�"))
			System.out.println("<"+num+">");
			else
			System.out.println(num);
			i++;
		}
	}
}
