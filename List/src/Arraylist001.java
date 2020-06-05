import java.util.ArrayList;

public class Arraylist001 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		
	}

}
