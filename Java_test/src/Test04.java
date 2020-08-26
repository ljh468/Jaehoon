import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test04 {
	public static void main(String[] args) {
		List<String> rList = new ArrayList<String>();
		rList.add("객체지향프로그래밍");
		rList.add("하둡");
		rList.add("MongoDB");
		
		int i = 0;
		Iterator<String> it = rList.iterator();
		while(it.hasNext()) {
			String str = it.next();
//		    if(str.equals("객체지향프로그래밍")){
			if(i==0) {
				System.out.println("<"+str+">");
			}else {
				System.out.println(str);
			}
			i++;
		}		
	}
}

