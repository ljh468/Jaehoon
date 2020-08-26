import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Test05 {
	public static void main(String[] args) {
		List<HashMap<String,String>> rList = new ArrayList<>();
		HashMap<String, String> pMap = new HashMap<>();
		pMap.put("name", "ÀÌÇù°Ç");
		pMap.put("Email", "h.lee@");
		pMap.put("addr", "¼­¿ï");
		
		rList.add(pMap);
		pMap = null;
		
		pMap = new HashMap<String,String>();
		pMap.put("name", "È«±æµ¿");
		pMap.put("Email", "g.hong@");
		pMap.put("addr", "°æ±â");
		
		rList.add(pMap);
		pMap = null;
		
		Iterator<HashMap<String,String>> it = rList.iterator();
		while(it.hasNext()) {
			HashMap<String,String> rMap = it.next();
			
			System.out.println("name :" + rMap.get("name"));
			System.out.println("email :" + rMap.get("Email"));
			System.out.println("addr :" + rMap.get("addr"));
			rMap = null;
			System.out.println();
		}		
	}
}
