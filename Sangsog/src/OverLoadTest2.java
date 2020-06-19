
public class OverLoadTest2 {
	
	public static void main(String[] arg) {
		
		OverLoading ol = new OverLoading();
		System.out.println(ol.sum(1, 2));
		System.out.println(ol.sum(1, 2, 3));
		System.out.println(ol.sum(1, 2, 3, 4));
		// OverLoading이 메모리에 안올라가서
		
	}
}