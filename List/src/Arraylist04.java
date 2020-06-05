import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Arraylist04 {

	public static void main(String[] args) {
		List<String> rList = new ArrayList<>();
		
	
		rList.add("객체지향프로그램");
		rList.add("하둡");
		rList.add("MongoDB");		
		
		/*배열크기 출력
		System.out.println("배열의크기 "+ rList.size());
		
		for(int i = 0; i<rList.size(); i++) {
			System.out.println("["+i+"]번째 배열 기억공간 : " + rList.get(i));
		}*/
		int i=0;
		Iterator<String> it = rList.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			if(str.equals("하둡")){
				System.out.println("<"+str+">");
			}
			else {
			System.out.println(str);
			}
			i++;
		}
	}
}