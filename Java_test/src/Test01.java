
public class Test01 {

	public static void main(String[] args) {
		int i = 0;
		int k = 0;
		for(i=3; i<9; i++) {
			if(i==3||i==5) {
				System.out.println("<"+i+"´Ü>");
			}
			for(k=1; k<10; k++) {
				System.out.println(i+"*"+k+"="+(i*k));
			}
			System.out.println();
		}
	}

}
