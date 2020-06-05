//ArrayList º¯Çü
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Ex04 {

	public static void main(String[] args) {
		
		List <String> al = new ArrayList<>();
		
		al.add("°´Ã¼ÁöÇâÇÁ·Î±×·¥");
		al.add("ÇÏµÓ");
		al.add("MongoDB");

		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			String str = it.next();
			if(str.equals("ÇÏµÓ")) {
					System.out.println("<"+str+">");
			break;
			}
		
		}
		
		}
}
	

