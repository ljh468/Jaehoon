import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Test05 {
	public static void main(String[] args) {
		List <HashMap<String,String>> rList = new ArrayList<>();
		HashMap<String,String> pMap = new HashMap<>();
		pMap.put("name","이재훈");
		pMap.put("email","ljh@");
		pMap.put("addr","안양");
		pMap.put("dept","데분");
		
		rList.add(pMap);
		pMap = null;
		
		pMap = new HashMap<>();
		pMap.put("name","홍길동");
		pMap.put("email","hong@");
		pMap.put("addr","서울");
		pMap.put("dept","시각");
		
		rList.add(pMap);
		pMap = null;
		
		Iterator<HashMap<String,String>> it = rList.iterator();
		while(it.hasNext()) {
			HashMap<String,String> rMap = it.next();
			System.out.println("반복시작");
			System.out.println(rMap.get("name"));
			System.out.println(rMap.get("email"));
			System.out.println(rMap.get("addr"));
			System.out.println(rMap.get("dept"));
			
			rMap = null;
			System.out.println("반복끝");
		}
		
	}
}
