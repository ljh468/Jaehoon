//for 구구단
public class Ex00 {

	public static void main(String[] args) {
		int i;
		int k;
		
		for(i=2; i<10; i++) {
			if(i==3||i==5) {
				System.out.println("<"+i+"단>");
			}
			for(k=1; k<10; k++) {
				System.out.println(i+"*"+k+"="+i*k);
			}
			System.out.println();
		}
	}

}
