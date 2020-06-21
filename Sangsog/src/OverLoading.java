
public class OverLoading {
	
	
	public static int le(int a, int b) {
		int lee = (a+b)*(a-b);
		return lee;
	}

	public static int sum(int a, int b, int c) {
		return sum(a, b, c, 0);
	}

	public static int sum(int a, int b, int c, int d) {
		
		int res = a + b + c + d;
		
		return res;
	}
}

// OverLoading ol = new OverLoading(); // static말고 클래스를 메모리에 올리는 법
// ol.sum(1,2);
// ol.sum(1,2,3);
// ol.sum(1,2,3,4);
// ol = null;