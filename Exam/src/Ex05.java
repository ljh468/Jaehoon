import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) {

		List <String> rList = new ArrayList<>();
		rList.add("자바프로그래밍비기너");
		rList.add("생활코딩");
		rList.add("자바의정석기초편");
		rList.add("자바의정석3판");
		
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
