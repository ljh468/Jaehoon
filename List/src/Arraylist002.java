import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist002 {
	public static void main(String[] args) {
		List<String> al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("Three");
		
		int i=1;
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			String st = it.next();
			if(i==1){
			System.out.println("<"+st+">");
			}
			else
			System.out.println(st);
			i++;
		}
		
	}
}
// for(i=0; i<arr.length i++)
// arr[i]= i+1

