//ArrayList 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Ex03 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		}
	}

