
public class Test01 {

	public static void main(String[] args) {
		int a;
		int b;
		for(a=2; a<=9; a++) {
			if(a==3||a==5) {
			System.out.println("("+a+"´Ü)");	
			}
			for(b=1; b<=9; b++) {
				System.out.println(a+"X"+b+"="+(a*b));
			}
			System.out.println();
		}
	}

}
