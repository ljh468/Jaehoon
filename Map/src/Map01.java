import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap

public class Map01 {

	public static void main(String[] args) {
		
		Map<String,String> a = new HashMap<>();
		
		a.put("name","������");
		a.put("email","hglee67@kopo.ac.kr");
		a.put("dept","�����ͺм���");
		
		System.out.println("=================================");
		System.out.println(a.get("name"));
		System.out.println(a.get("email"));
		System.out.println(a.get("dept"));
		System.out.println(a.get("��Ÿ"));
		System.out.println("=================================");
/*		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}
		static void iteratorUsingForEach(HashMap map) { 
			// (a) ==> map
			Set<Map.Entry<String, Integer>> entries = map.entrySet(); 
			//SetŸ������ ������ entries ������ �̵� 
			for(Map.Entry<String, Integer> entry : entries) { 
				//SetŸ���� entries�������� ���� entry�� ��´�.
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	
		static void iteratorUsingIterator (HashMap map) {
			Set<Map.Entry<String, Integer>> entries = map.entrySet();
			//map.entrySet�� �̿��Ͽ� Map.Setȭ �Ͽ� Map.Entry()�������� entries�� ����
			Iterator<Map.Entry<String,Integer>> it = entries.iterator();
			//iterator ������ ����
			while(it.hasNext()) {
				Map.Entry<String,Integer> entry = it.next();
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
*/
		}
		
	}