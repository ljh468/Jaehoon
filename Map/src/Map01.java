import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap

public class Map01 {

	public static void main(String[] args) {
		
		Map<String,String> a = new HashMap<>();
		
		a.put("name","이협건");
		a.put("email","hglee67@kopo.ac.kr");
		a.put("dept","데이터분석과");
		
		System.out.println("=================================");
		System.out.println(a.get("name"));
		System.out.println(a.get("email"));
		System.out.println(a.get("dept"));
		System.out.println(a.get("오타"));
		System.out.println("=================================");
/*		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}
		static void iteratorUsingForEach(HashMap map) { 
			// (a) ==> map
			Set<Map.Entry<String, Integer>> entries = map.entrySet(); 
			//Set타입으로 복사후 entries 변수에 이동 
			for(Map.Entry<String, Integer> entry : entries) { 
				//Set타입의 entries변수안의 값을 entry에 담는다.
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	
		static void iteratorUsingIterator (HashMap map) {
			Set<Map.Entry<String, Integer>> entries = map.entrySet();
			//map.entrySet을 이용하여 Map.Set화 하여 Map.Entry()형식으로 entries에 저장
			Iterator<Map.Entry<String,Integer>> it = entries.iterator();
			//iterator 구조를 변경
			while(it.hasNext()) {
				Map.Entry<String,Integer> entry = it.next();
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
*/
		}
		
	}